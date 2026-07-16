void main() {
    Scanner sc = new Scanner(System.in);

    int a, b;

    System.out.println("Primeiro numero:");
    a = sc.nextInt();
    System.out.println("Segundo numero:");
    b = sc.nextInt();

    if (a < b) {
        if (b % a == 0 ){
            System.out.println("São multiplos.");
        }
        else {
            System.out.println("Não são multiplos.");
        }
    }
    else {
        if (a % b == 0 ){
            System.out.println("São multiplos.");
        }
        else {
            System.out.println("Não são multiplos.");
        }
    }
}