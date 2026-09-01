import java.util.Locale;

public class program {

     public static void main(String[] args) {
    	 
    	    String nome = "Rosemary";
    	    int idade = 31;
    	    double renda = 4000.0;
    	    		
    	    int y = 32;
    	    double x = 10.35784;
    	    
    	    
    	    System.out.println (x);
    	    System.out.printf ("%.2f%n",x); // Retorna a variavel com o x formatado em 2 casas decimais e o "n" pra quebrar linha
            Locale.setDefault(Locale.US);
            System.out.printf ("%.2f%n",x); 
    	    System.out.println(y);
    	    System.out.println ("RESULTADO = " + x + " METROS");
    	    System.out.printf("RESULTADO =  %.2f metros%n" , x );
    	    
           System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome,idade,renda);
     }
}
