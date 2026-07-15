void main() {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();

    String dia;
    dia = "";

    switch (x) {
        case 1:
            dia = "domingo";
            break;
        case 2:
            dia = "Segunda";
            break;
        case 3:
            dia = "terça";
            break;
        case 4:
            dia = "quarta";
            break;
        case 5:
            dia = "quinta";
            break;
        case 6:
            dia = "sexta";
            break;
        case 7:
            dia = "sabado";
            break;
        default:
            dia = "valor invalido";
            break;
    }

    System.out.println("Dia da semana: " + dia);
    sc.close();
}