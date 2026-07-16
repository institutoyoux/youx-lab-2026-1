void main() {
    Scanner sc = new Scanner(System.in);

    int inicio, fim, duracao;

    System.out.println("Hora de inicio:");
    inicio = sc.nextInt();
    System.out.println("Hora do fim:");
    fim = sc.nextInt();

    if (inicio < fim) {
        duracao = fim - inicio;
        System.out.printf("O jogo durou %d hora(s)%n", duracao);
    } else if (inicio == fim) {
        System.out.println("O jogo durou 24 hora(s)");
    }
    else {
        duracao = inicio - fim;
        System.out.printf("O jogo durou %d hora(s)%n", duracao);
    }

    sc.close();
}