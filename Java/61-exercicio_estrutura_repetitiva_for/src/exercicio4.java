void main() {
    Scanner sc = new Scanner(System.in);

    int x, numerador, denominador;

    x = sc.nextInt();

    for (int n = 0; n < x; n++) {
        numerador = sc.nextInt();
        denominador = sc.nextInt();
        if (denominador == 0) {
            System.out.println("Divisão impossivel");
        }
        else {
            double resultado = numerador / denominador;
            System.out.println(resultado);
        }
    }

    sc.close();
}