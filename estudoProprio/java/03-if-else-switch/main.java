public class main {
    public static void main(String[] args) {
        int pos = 1;

        switch (pos) {
            case 1:
                System.out.println("Ganhou em 1° lugar");
                break;
            case 2:
                System.out.println("Ganhou em 2° lugar");
                break;
            case 3:
                System.out.println("Ganhou em 3° lugar");
                break;
            case 4: case 5:
                System.out.println("Premio de participação!");
                break;
            default: 
                System.out.println("Não está no podio");
                break;
        }
    }
}