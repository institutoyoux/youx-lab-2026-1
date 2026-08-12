package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

    static void main() {

        List<Employee> list = new ArrayList<>();
        String path = "/home/youx/Atividades/2/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String employeeCsv = br.readLine();
            while (employeeCsv != null){
                String[] filds = employeeCsv.split(",");
                list.add(new Employee(filds[0], Double.parseDouble(filds[1])));
                employeeCsv = br.readLine();
            }

            Collections.sort(list);
            for (Employee emp: list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
