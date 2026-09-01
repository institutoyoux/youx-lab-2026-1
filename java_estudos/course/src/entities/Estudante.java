package entities;

public class Estudante {
    public String nome;
    public int n1;
    public int n2;
    public int n3;

    public int nota_final() {
        return n1+n2+n3;
    }

    public int passa_reprova() {
        if (nota_final() > 60) {
            System.out.println("APROVADO");
        }
        else {
            System.out.println("REPROVADO");
            int falta = 60 - nota_final();
            System.out.println("FALTA: " + falta);
        }
         return 0;
    }
}

