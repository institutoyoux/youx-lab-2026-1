package com.projetouno.novoprojetouno.services;

import com.projetouno.novoprojetouno.models.Carta;
import com.projetouno.novoprojetouno.models.Sala;
import com.projetouno.novoprojetouno.models.Usuario;
import com.projetouno.novoprojetouno.repositories.SalaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class SalaService {
    private final SalaRepository repository;
    private final BaralhoService baralhoService;
    private final UsuarioService usuarioService;

    public Sala criarSala(Usuario usuario) {
        removerUsuarioTodasSala(usuario);
        Sala sala = new Sala();
        sala.setCodigo(gerarCodigo());
        sala.setJogador1(usuario);
        sala.setVezJogador1(true);
        repository.save(sala);
        sala.setBaralho(baralhoService.criarBaralho(sala));
        sala.setCartaAtual(baralhoService.comprar(sala.getBaralho(), 1).getFirst());
        usuario.setCartas(baralhoService.comprar(sala.getBaralho(), 7));
        usuarioService.salvar(usuario);
        return repository.save(sala);
    }
    public void removerUsuarioTodasSala(Usuario usuario) {
        List<Sala> salas = obterSalasJogadorEsta(usuario);
        salas.forEach(sala -> {
            if (sala.getJogador1() != null && sala.getJogador1().getId().equals(usuario.getId())) {
                sala.setJogador1(null);
            } else {
                sala.setJogador2(null);
            }
            repository.save(sala);
        });
    }
    public void entrarSala(Usuario usuario, Integer codigoSala) {
        Sala sala = obterPorCodigo(codigoSala)
                .orElseThrow(() -> new IllegalArgumentException("Sala não encontrada!"));
        if (sala.getJogador1() != null && sala.getJogador1() == usuario ||sala.getJogador2() != null &&  sala.getJogador2() == usuario) {
            throw new IllegalArgumentException("O usuario já está na sala!");
        }
        removerUsuarioTodasSala(usuario);
        if (sala.getJogador1() == null) {
            sala.setJogador1(usuario);
        } else if (sala.getJogador2() == null) {
            sala.setJogador2(usuario);
        } else {
            System.out.println("Esta sala está lotada!");
        }
        usuario.setCartas(baralhoService.comprar(sala.getBaralho(), 7));
        usuarioService.salvar(usuario);
        repository.save(sala);
    }

    private Integer gerarCodigo() {
        Random random = new Random();
        return random.nextInt(999999 - 100000) + 100000;
    }

    public List<Sala> obterSalasJogadorEsta(Usuario usuario) {
        return repository.findByJogador1OrJogador2(usuario, usuario);
    }

    public void jogarCartas(Usuario usuario, List<Integer> ids) {
        Sala sala = obterSalasJogadorEsta(usuario).getFirst();
        Boolean souj1 = sala.getJogador1().equals(usuario);
        if (souj1 && !sala.getVezJogador1() || !souj1 && sala.getVezJogador1()) {
            throw new IllegalArgumentException("Não é a vez desse jogador!");
        }
        List<Carta> cartas = new ArrayList<>();
        ids.forEach(id -> {
            Carta carta = obterCartaUsuario(usuario, id)
                    .orElseThrow(() -> new IllegalArgumentException("Carta não encontrada!"));
            if (!cartas.isEmpty()) {
                Carta cartaAtual = cartas.getLast();
                if (cartaAtual.getCor() != carta.getCor() && cartaAtual.getNumero() != carta.getNumero()) {
                    throw new IllegalArgumentException("As cartas não se coincidem");
                }
                cartas.add(carta);
            } else {
                cartas.add(carta);
            }
        });
        Carta ultimaCarta = cartas.getLast();
        if (ultimaCarta.getCor() != sala.getCartaAtual().getCor() && !Objects.equals(ultimaCarta.getNumero(), sala.getCartaAtual().getNumero())) {
            throw new IllegalArgumentException("As cartas não se coincidem");
        }
        sala.setCartaAtual(ultimaCarta);
        sala.setVezJogador1(!sala.getJogador1().equals(usuario));
        usuario.getCartas().removeAll(cartas);
        usuarioService.salvar(usuario);
        repository.save(sala);
    }

    private Optional<Carta> obterCartaUsuario(Usuario usuario, Integer id) {
        return usuario.getCartas().stream().filter(carta -> carta.getId().equals(id)).findFirst();
    }

    public Optional<Sala> obterPorCodigo(Integer codigo) {
        return repository.findByCodigo(codigo);
    }

    public void comprarCarta(Usuario usuario) {
        Sala sala = obterSalasJogadorEsta(usuario).getFirst();
        Boolean souj1 = sala.getJogador1().equals(usuario);
        if (souj1 && sala.getVezJogador1() || !souj1 && !sala.getVezJogador1()) {
            usuario.getCartas().add(baralhoService.comprar(sala.getBaralho(), 1).getFirst());
            usuarioService.salvar(usuario);
        } else {
            throw new IllegalArgumentException("Não é a vez deste jogador!");
        }
    }
}