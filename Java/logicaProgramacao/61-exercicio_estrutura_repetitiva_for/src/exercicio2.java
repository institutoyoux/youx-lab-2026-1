void main() {
    Scanner sc = new Scanner(System.in);


    int in, out;
    in = 0;
    out = 0;

    System.out.println("Quantos numero vai digitar:");
    int quantidade = sc.nextInt();

    for (int x = 0; x < quantidade; x++) {
        int numero = sc.nextInt();

        if (numero >= 10 && numero <= 20) {
            in += 1;
        }
        else {
            out += 1;
        }
    }

    System.out.println(in + " in");
    System.out.println(out + " out");

    sc.close();
}