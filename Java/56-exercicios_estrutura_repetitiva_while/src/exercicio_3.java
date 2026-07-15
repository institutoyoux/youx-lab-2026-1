void main() {
    Scanner sc = new Scanner(System.in);

    int alcool, gasolina, diesel, comando;

    alcool = 0;
    gasolina = 0;
    diesel = 0;

    System.out.println("Combustivel(1: alccol, 2: gasolina, 3: diesel):");
    comando = sc.nextInt();

    while (comando != 4) {
        if (comando < 1 || comando > 4) {
            System.out.println("Comando invalido. Tente novamente.");
            comando = sc.nextInt();
        }
        switch (comando) {
            case 1:
                alcool += 1;
                break;
            case 2:
                gasolina += 1;
                break;
            case 3:
                diesel += 1;
                break;
        }

        System.out.println("Combustivel(1: alccol, 2: gasolina, 3: diesel):");
        comando = sc.nextInt();
    }

    System.out.printf("Alcool: %d %n", alcool);
    System.out.printf("Gasolina: %d %n", gasolina);
    System.out.printf("Diesel: %d %n", diesel);
}