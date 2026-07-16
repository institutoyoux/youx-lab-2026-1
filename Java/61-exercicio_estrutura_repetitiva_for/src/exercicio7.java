void main() {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    for (int x = 1; x <= N; x++) {
        double quadrado, cubo;
        quadrado = Math.pow(x, 2);
        cubo = Math.pow(x, 3);
        System.out.println(x + " " + quadrado + " " + cubo);
    }

    sc.close();
}