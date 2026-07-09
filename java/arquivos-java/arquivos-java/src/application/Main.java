package application;

import java.io.*;
import java.util.Scanner;

public class Main {
    //    public static void main(String[] args) {
//        File file = new File("/home/instituto/youx-lab-2026-1/java/arquivos-java/in.txt");
//        Scanner input = null;
//        try {
//            input = new Scanner(file);
//            while (input.hasNextLine()) {
//                System.out.println(input.nextLine());
//            }
//        } catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        } finally {
//            if (input != null){
//                input.close();
//            }
//        }
//    }
//    public static void main(String[] args) {
//        String path = "/home/instituto/youx-lab-2026-1/java/arquivos-java/in.txt";
//
//        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//            String line = br.readLine();
//            while (line != null) {
//                System.out.println(line);
//                line = br.readLine();
//            }
//        }
//        catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
    public static void main(String[] args) {
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path = "/home/instituto/youx-lab-2026-1/java/arquivos-java/out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}