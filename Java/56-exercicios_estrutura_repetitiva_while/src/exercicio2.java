void main() {
    Scanner sc = new Scanner(System.in);

    int x, y;

    System.out.println("Valor de X:");
    x = sc.nextInt();
    System.out.println("Valor de Y:");
    y = sc.nextInt();

    while (x != 0 || y != 0) {
        if (x > 0 && y > 0) {
            System.out.println("Primeiro");
        } else if (x < 0 && y > 0) {
            System.out.println("Segundo");
        } else if (x < 0 && y < 0) {
            System.out.println("Terceiro");
        } else if (x > 0 && y < 0) {
            System.out.println("Quarto");
        }

        System.out.println("Valor de X:");
        x = sc.nextInt();
        System.out.println("Valor de Y:");
        y = sc.nextInt();
    }

    sc.close();
}