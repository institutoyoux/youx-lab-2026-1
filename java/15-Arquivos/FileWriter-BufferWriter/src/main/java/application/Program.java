package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Program {
    public static void main(String[] args) {

        String[] lines = new String[]{"Good Morning!", "Good Afternoon!", "Good Night!"
        };

        String path = "/home/you/testesJava2.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
