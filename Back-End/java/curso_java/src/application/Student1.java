package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Student2;
public class Student1 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student2 std = new Student2();

        std.name = sc.nextLine();
        std.grade_1 = sc.nextDouble();
        std.grade_2 = sc.nextDouble();
        std.grade_3 = sc.nextDouble();
        System.out.print("Final grade: ");
        System.out.println(std.finalGrade());
        System.out.print(std.status());
    }
}
