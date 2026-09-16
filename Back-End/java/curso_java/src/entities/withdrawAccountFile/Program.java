package entities.withdrawAccountFile;
import entities.withdrawAccountFile.Account;
import java.util.Scanner;
public class Program {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         System.out.print("Number: ");
         Integer number = sc.nextInt();

         System.out.print("Name: ");
         sc.nextLine();
         String holder = sc.nextLine();

         System.out.print("Initial Balance: ");
         Double initialBalance = sc.nextDouble();

         System.out.print("Withdraw Limit: ");
         Double withdrawLimit = sc.nextDouble();

         Account acc = new Account(number, holder, initialBalance, withdrawLimit);

         System.out.println();

         System.out.println(acc);

         System.out.print("Enter amount for withdraw: ");
         acc.withdraw(sc.nextDouble());
     }

}
