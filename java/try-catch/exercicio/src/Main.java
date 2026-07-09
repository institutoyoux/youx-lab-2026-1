import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.print("Room number: ");
            int number = input.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkin = sdf.parse(input.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkout = sdf.parse(input.next());
            Reservation reserva = new Reservation(number, checkin, checkout);
            System.out.println("Reservation: " + reserva);

            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkin = sdf.parse(input.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkout = sdf.parse(input.next());

            reserva.updateDates(checkin, checkout);
            System.out.println("Reservation: " + reserva);
        }
        catch (ParseException e) {
            System.out.println("Invalid date format");
        }
        catch (DomainException   e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected erro");
        }
    }
}