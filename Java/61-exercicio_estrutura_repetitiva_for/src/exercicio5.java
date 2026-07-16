void main() {
    Scanner sc = new Scanner(System.in);

    int valor, fatorial;

    valor = sc.nextInt();
    fatorial = valor;

    if (valor == 0) {
        fatorial = 1;
    }
    else {
        for (int x = valor-1; x > 0; x--) {
            fatorial *= x;
        }
    }


    System.out.println(fatorial);

    sc.close();
}