package application;

import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Diretorio do arquivo: ");
        String dir = input.next();

        try (BufferedReader br = new BufferedReader(new FileReader(dir))) {
            Set<LogEntry> set = new HashSet<>();
            String line = br.readLine();
            while (line != null) {
                
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        input.close();
    }
}
