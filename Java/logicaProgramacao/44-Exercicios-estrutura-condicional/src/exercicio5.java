void main() {
    Scanner sc = new Scanner(System.in);

    int codigo;
    double quantidade, total;

    System.out.println("Codigo do pedido:");
    codigo = sc.nextInt();
    System.out.println("Quantidade:");
    quantidade = sc.nextDouble();

    if (codigo == 1) {
        total = 4.0 * quantidade;
        System.out.printf("Total: R$%.2f %n", total);
    } else if (codigo == 2) {
        total = 4.50 * quantidade;
        System.out.printf("Total: R$%.2f %n", total);
    } else if (codigo == 3) {
        total = 5.0* quantidade;
        System.out.printf("Total: R$%.2f %n", total);
    } else if (codigo == 4) {
        total = 2.0 * quantidade;
        System.out.printf("Total: R$%.2f %n", total);
    } else if (codigo == 5) {
        total = 1.5 * quantidade;
        System.out.printf("Total: R$%.2f %n", total);
    }

    sc.close();
}