public class Main {
    public static void main(String[] args) {
        Personagem[] personagens = new Personagem[2];
        personagens[0] = new Personagem("Alfredo", "Guerreiro", 1, 2000);
        personagens[1] = new Personagem("Teste", "Guerreiro", 1, 20);
        relatorio(personagens);
        nomes(personagens);
        maiorNivel(personagens);
        classes(personagens);
        media(personagens);
    }

    public static String rank(Personagem personagem) {
        String rank = "";
        if (personagem.experiencia < 5000) {
            rank = "iniciante";
        } else if (personagem.experiencia >= 5000 && personagem.experiencia < 15000) {
            rank = "Veterano";
        } else if (personagem.experiencia >= 15000) {
            rank = "Lendário";
        }
        return rank;
    }

    public static void relatorio(Personagem[] personagens) {
        for (Personagem personagem : personagens) {
            System.out.println("Nome: " + personagem.nome);
            System.out.println("Classe: " + personagem.classe);
            System.out.println("Nível: " + personagem.nivel);
            System.out.println("Rank: " + rank(personagem));
        }
    }

    public static void nomes(Personagem[] personagens) {
        String[] nomes = new String[personagens.length];
        for (int i = 0; i < personagens.length; i++) {
            nomes[i] = personagens[i].nome;
        }
        for (String nome : nomes) {
            System.out.println("Nome do personagem: " + nome);
        }
    }

    public static void maiorNivel(Personagem[] personagens) {
        Personagem atual = personagens[0];
        for (Personagem personagem : personagens) {
            if (personagem.nivel >= atual.nivel) {
                atual = personagem;
            }
        }
        System.out.println("Personagem com maior nível: " + atual.nome);
    }

    public static void classes(Personagem[] personagens) {
        Classe[] classes = new Classe[personagens.length];
        for (int i = 0; i < personagens.length; i++) {
            if (classes[0] == null) {
                classes[0] = new Classe(personagens[i].classe);
            } else {
                for (Classe classe : classes) {
                    if (classe != null && classe.nome.equals(personagens[i].classe)) {
                        classe.somar();
                        break;
                    } else if (classe == null) {
                        classes[i] = new Classe(personagens[i].classe);
                        break;
                    }
                }
            }
        }
        for (Classe classe : classes) {
            if (classe != null) {
                System.out.println("Classe: " + classe.nome +
                        " | Quantidade: " + classe.quantidade);
            }
        }
    }
    public static void media(Personagem[] personagens) {
        int soma = 0;
        for (Personagem personagem : personagens) {
            soma += personagem.nivel;
        }
        float media = soma / personagens.length;
        System.out.println("Média de nível dos personagens: " + media);

    }
}
