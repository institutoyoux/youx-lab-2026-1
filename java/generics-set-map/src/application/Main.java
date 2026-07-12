package application;

import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
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
                String[] dados = line.split(" ");
                String username = dados[0];
                Date hora = Date.from(Instant.parse(dados[1]));
                set.add(new LogEntry(username, hora));
                line = br.readLine();
            }
            System.out.println("Total users: " + set.size());
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        input.close();
    }
}
