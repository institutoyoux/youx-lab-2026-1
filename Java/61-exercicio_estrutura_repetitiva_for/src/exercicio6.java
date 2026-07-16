void main() {
    Scanner sc = new Scanner(System.in);

    int valor = sc.nextInt();

    for (int x = 1;x <= valor; x++) {
        if (valor % x == 0) {
            System.out.println(x);
        }
    }

    sc.close();
}