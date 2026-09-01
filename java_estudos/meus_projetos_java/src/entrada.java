import java.util.Locale;
import java.util.Scanner;

public class entrada {
   public static void main(String[] args) {
	   
	   Scanner sc = new Scanner(System.in);
	   
	   String x;
	   x = sc.next();
	   System.out.println("Voce digitou: " +x);
	   
	   int y;
	   y = sc.nextInt();
	   System.out.println("Voce digitou o numero: " +y);
	   
	   double j;
	   j = sc.nextDouble();
	   Locale.setDefault(Locale.US);
       System.out.println("Voce digitou: " +j);	
       
       char z;
       z = sc.next().charAt(0);
       System.out.println("Voce digitou: " +z);
       
       String f;
       int h;
       double k;
       f = sc.next();
       h = sc.nextInt();
       k = sc.nextDouble();
       System.out.println("Os dados digitados foram: ");
       System.out.println(f);
       System.out.println(h);
       System.out.println(k);
       
       int w;
       String s1, s2, s3;
       w = sc.nextInt();
       sc.nextLine();
       s1 = sc.nextLine();
       s2 = sc.nextLine();
       s3 = sc.nextLine();
       System.out.println("DADOS DIGITADOS:");
       System.out.println(w);
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
       
	   sc.close();
   }
	
}
