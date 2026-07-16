void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um numero:");
    int numero = sc.nextInt();

    for (int x = 1; x <= numero; x++) {
        if (x % 2 != 0) {
            System.out.println(x);
        }
    }

    sc.close();
}