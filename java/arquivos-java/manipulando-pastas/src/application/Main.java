package application;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a path: ");
        String inPath = input.next();
        File path = new File(inPath);
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder);
        }
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);
        }
        boolean sucess = new File(inPath + "\\subdir").mkdir();
        System.out.println("Criado?: " + sucess);
    }
}