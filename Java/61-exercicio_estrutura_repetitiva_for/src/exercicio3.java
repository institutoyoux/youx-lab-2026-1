void main() {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    float soma, peso, media;
    soma = 0;
    peso = 0;

    for (int x = 1; x < N + 1; x++) {
        double valor = sc.nextDouble();
        if (x == 1) {
            soma += valor * 2;
            peso += 2;
        } else if (x == 2) {
            soma += valor * 3;
            peso += 3;
        } else if (x == 3) {
            soma += valor * 5;
            peso +=5;
        }
    }

    media = soma / peso;

    System.out.printf("%.1f", media);

    sc.close();
}