package com.api.casaDeApostas.services;

import com.api.casaDeApostas.configs.JogoConfig;
import com.api.casaDeApostas.dtos.*;
import com.api.casaDeApostas.entities.*;
import com.api.casaDeApostas.enums.ResultadoJogo;
import com.api.casaDeApostas.enums.StatusJogo;
import com.api.casaDeApostas.enums.TipoPosicao;
import com.api.casaDeApostas.repositories.JogoRepository;
import com.api.casaDeApostas.repositories.UserRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class JogoService {

    private final JogoRepository jogoRepository;
    private final JogoConfigService jogoConfigService;
    private final UserService userService;

    public JogoService(
            JogoRepository jogoRepository,
            JogoConfigService jogoConfigService,
            UserService userService) {
        this.jogoRepository = jogoRepository;
        this.jogoConfigService = jogoConfigService;
        this.userService = userService;
    }

    public CriarJogoResponseDTO criarJogo(User user, CriarJogoDTO dto) {

        //Busca a configuração atual
        JogoConfig config = jogoConfigService.buscarConfiguracao();

        Integer quantidadeDeBombas = config.getQuantidadeDeBombas();

        //Cria o jogo
        Jogo jogo = new Jogo();

        jogo.setUser(user);
        jogo.setQuantidadeDeBombas(quantidadeDeBombas);
        jogo.setDiamantesEncontrados(0);
        jogo.setValorAposta(dto.valorAposta());

        //Gera os números de 1 até 25
        List<Integer> numeros = IntStream.rangeClosed(1, 25)
                .boxed()
                .collect(Collectors.toList());

        //Embaralha os números
        Collections.shuffle(numeros);

        //Seleciona as posições que serão bombas
        Set<Integer> bombas = new HashSet<>(
                numeros.subList(0, quantidadeDeBombas)
        );

        //Cria as 25 posições
        List<PosicaoJogo> posicoes = new ArrayList<>();

        for (int numero = 1; numero <= 25; numero++) {

            PosicaoJogo posicao = new PosicaoJogo();

            posicao.setNumero(numero);

            if (bombas.contains(numero)) {
                posicao.setTipo(TipoPosicao.BOMBA);
            } else {
                posicao.setTipo(TipoPosicao.DIAMANTE);
            }

            posicao.setRevelada(false);

            posicoes.add(posicao);
        }

        jogo.setPosicoes(posicoes);

        //Salva o jogo
        Jogo jogoSalvo = jogoRepository.save(jogo);

        //Retorna somente os números
        return new CriarJogoResponseDTO(
                jogoSalvo.getId(),
                posicoes.stream()
                        .map(PosicaoJogo::getNumero)
                        .toList(),
                jogoSalvo.getValorAposta()
        );
    }

    public SelecionarPosicaoResponseDTO selecionarPosicao(
            UUID jogoId,
            User user,
            Integer numeroPosicao
    ) {

        // Busca o jogo
        Jogo jogo = jogoRepository.findById(jogoId)
                .orElseThrow(() -> new RuntimeException("Jogo não encontrado."));
        System.out.println(user.getEmail());
        // Verifica se o jogo pertence ao usuário
        if (!jogo.getUser().getId().equals(user.getId())) {
            throw new RuntimeException("Você não tem permissão para acessar este jogo.");
        }

        // Verifica se o jogo ainda está em andamento
        if (jogo.getStatus() != StatusJogo.EM_ANDAMENTO) {
            throw new RuntimeException("Este jogo já foi finalizado.");
        }

        // Procura a posição selecionada
        PosicaoJogo posicao = jogo.getPosicoes()
                .stream()
                .filter(p -> p.getNumero().equals(numeroPosicao))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Posição inválida."));

        // Verifica se a posição já foi revelada
        if (posicao.isRevelada()) {
            throw new RuntimeException("Esta posição já foi selecionada.");
        }

        // Revela a posição
        posicao.setRevelada(true);

        // Verifica o resultado
        if (posicao.getTipo() == TipoPosicao.BOMBA) {

            jogo.setStatus(StatusJogo.FINALIZADO);
            jogo.setResultado(com.api.casaDeApostas.enums.ResultadoJogo.DERROTA);
            jogo.setDataFinalizacao(LocalDateTime.now());

        } else {
            jogo.setDiamantesEncontrados(jogo.getDiamantesEncontrados() + 1);
        }

        // Salva as alterações
        jogoRepository.save(jogo);

        return new SelecionarPosicaoResponseDTO(
                jogo.getId(),
                numeroPosicao,
                posicao.getTipo(),
                jogo.getStatus(),
                jogo.getValorAposta()
        );
    }

    public SelecionarPosicaoResponseDTO finalizarJogo(
            UUID jogoId,
            User user
    ) {

        // Busca o jogo
        Jogo jogo = jogoRepository.findById(jogoId)
                .orElseThrow(() -> new RuntimeException("Jogo não encontrado."));
        // Verifica se o jogo pertence ao usuário
        if (!jogo.getUser().getId().equals(user.getId())) {
            throw new RuntimeException("Você não tem permissão para acessar este jogo.");
        }

        // Verifica se o jogo ainda está em andamento
        if (jogo.getStatus() != StatusJogo.EM_ANDAMENTO) {
            throw new RuntimeException("Este jogo já foi finalizado.");
        }

        // Finaliza o jogo
        jogo.setStatus(StatusJogo.FINALIZADO);
        jogo.setResultado(ResultadoJogo.VITORIA);
        jogo.setDataFinalizacao(LocalDateTime.now());

//        user.setBalance(user.getBalance() + BigDecimal.valueOf (jogo.getValorAposta() * (1 + (jogo.getDiamantesEncontrados() * 0.33)) ))));
//        (valor_apostado) * (1 + (quantidade_de_diamantes_encontrados * 0.33))
        user.setBalance(user.getBalance()
                .add(jogo.getValorAposta()
                        .multiply(BigDecimal.ONE
                                .add(BigDecimal.valueOf(jogo.getDiamantesEncontrados())
                                    .multiply(new BigDecimal("0.33"))))));

        jogoRepository.save(jogo);
        userService.save(user);

        return new SelecionarPosicaoResponseDTO(
                jogo.getId(),
                null,
                null,
                jogo.getStatus(),
                jogo.getValorAposta()
        );
    }

    public AdminDashboardDTO adminDashboard() {
        BigDecimal ganhos = jogoRepository
            .findAllByResultado(ResultadoJogo.DERROTA)
            .stream()
            .map(Jogo::getValorAposta)
            .reduce(BigDecimal.ZERO, BigDecimal::add);
        return new AdminDashboardDTO(
                ganhos,
                jogoRepository.findAll().size()
        );
    }

    public UserDashboardDTO userDashboard() {
        Authentication authentication = SecurityContextHolder
                .getContext()
                .getAuthentication();

        User user = (User) authentication.getPrincipal();

        Integer jogosFeitos = jogoRepository.countByUserId(user.getId());

        Integer wins = jogoRepository.countByUserIdAndResultado(
                user.getId(),
                ResultadoJogo.VITORIA
        );

        Integer loses = jogoRepository.countByUserIdAndResultado(
                user.getId(),
                ResultadoJogo.DERROTA
        );

        return new UserDashboardDTO(
                jogosFeitos,
                wins,
                loses
        );
    }
}