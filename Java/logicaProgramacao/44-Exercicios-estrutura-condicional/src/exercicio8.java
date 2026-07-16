void main() {
    Scanner sc = new Scanner(System.in);

    double renda, imposto;

    System.out.println("Renda:");
    renda = sc.nextDouble();

    if (renda >= 2000.01 && renda <= 3000) {
        imposto = renda * 8 / 100;
        System.out.printf("R$ %.2f%n", imposto);
    } else if (renda >= 3000.01 && renda <= 4500) {
        imposto = renda * 18 / 100;
        System.out.printf("R$ %.2f%n", imposto);
    } else if (renda > 4500) {
        imposto = renda * 28 / 100;
        System.out.printf("R$ %.2f%n", imposto);
    }
    else {
        System.out.println("Isento");
    }

    sc.close();
}