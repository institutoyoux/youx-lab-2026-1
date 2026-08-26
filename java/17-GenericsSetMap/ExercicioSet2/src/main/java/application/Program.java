package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.print("How many students for course A? ");
        int studentsA = sc.nextInt();

        Set<Integer> students = new HashSet<Integer>();

        for  (int i = 1; i <= studentsA; i++) {
            students.add(sc.nextInt());
        }

        System.out.print("How many students for course B? ");
        int studentsB = sc.nextInt();
        for  (int i = 1; i <= studentsB; i++) {
            students.add(sc.nextInt());
        }

        System.out.print("How many students for course C? ");
        int studentsC = sc.nextInt();
        for  (int i = 1; i <= studentsC; i++) {
            students.add(sc.nextInt());
        }

        System.out.print("Total students: " + students.size());
    }
}
