void main() {
    Scanner sc = new Scanner(System.in);

    double x, y;

    System.out.println("Valor de X:");
    x = sc.nextDouble();
    System.out.println("Valor de Y:");
    y = sc.nextDouble();

    if (x > 0 && y > 0) {
        System.out.println("Q1");
    } else if (x < 0 && y > 0) {
        System.out.println("Q2");
    } else if (x < 0 && y < 0) {
        System.out.println("Q3");
    } else if (x > 0 && y < 0) {
        System.out.println("Q4");
    }
    else {
        System.out.println("Origem");
    }
}