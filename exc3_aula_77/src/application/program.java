package application;
import java.util.Locale;
import java.util.Scanner;
import entities.student;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        student student = new student();

        System.out.print("Student Name:");
        student.name = sc.nextLine();

        System.out.print("First Note:");
        student.grade1 = sc.nextDouble();

        System.out.print("Second Note:");
        student.grade2 = sc.nextDouble();

        System.out.print("Third Note:");
        student.grade3 = sc.nextDouble();
        System.out.println("============================================");
        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }
        else {
            System.out.println("PASS");
        }
        sc.close();
    }
}

