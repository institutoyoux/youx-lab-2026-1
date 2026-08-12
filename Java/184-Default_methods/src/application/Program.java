package application;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int moths = sc.nextInt();

        InterestService is = new UsaInterestService(1.0);
        double payment = is.payment(amount, moths);

        System.out.println("Payment after " + moths + " months:");
        System.out.println(String.format("%.2f", payment));

    }
}
