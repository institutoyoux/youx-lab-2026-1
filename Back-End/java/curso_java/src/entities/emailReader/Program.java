package entities.emailReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        System.out.print("Enter salary: ");
        Double salary = sc.nextDouble();

        System.out.println("Email of people whose salary is more than " + salary + ": ");
        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            List<People> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new People (fields[0],fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }
            List<String> Teste = list.stream()
                    .filter(p -> p.getSalary() >= salary)
                    .map(People::getEmail)
                    .sorted()
                    .collect(Collectors.toList());
            Teste.forEach(System.out:: println);
        }catch (IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.print("Enter a letter: ");
        String letter = sc.next();
        sc.nextLine();
        char firstLetter = letter.charAt(0);

        System.out.print("Sum of salary of people whose name starts with '" + letter.toUpperCase() + "': ");
        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            List<People> list = new ArrayList<>();
            Double sum = 0.0;
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new People (fields[0],fields[1], Double.parseDouble(fields[2])));
                String firstChar = fields[0].substring(0,1);
                if(firstChar.equalsIgnoreCase(letter)){
                    sum += Double.parseDouble(fields[2]);
                }
                line = br.readLine();
            }
            System.out.printf(String.valueOf(sum));
        }catch (IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }


    }
}
