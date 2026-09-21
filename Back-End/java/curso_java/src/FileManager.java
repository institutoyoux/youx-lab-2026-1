import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;

public class FileManager {
    public static void main(String[] args) throws InterruptedException, IOException {

        Scanner sc = new Scanner(System.in);
        String resp1 = "Break";
        Integer resp2 = 0;
        String resp3 = "";
        String resp4 = "s";
        String try1 = "";
        String path = "";
        Integer lineCount = 1;

        String inputPath = "";
        Integer lineToRemove = 0;

        while (resp1.equalsIgnoreCase("Break")) {
            try{
                resp4 = "s";
                System.out.println("-=-".repeat(8));
                System.out.print("[1] Read folder path\n[2] Read file\n[3] Modify | Create file\n");
                System.out.println("-=-".repeat(8));
                System.out.print("Your answer: ");
                resp2 = sc.nextInt();
                System.out.println("-=-".repeat(8));
                try1 = "break";
            }catch (InputMismatchException e){
                System.out.println("LOSER");
                try1 = "";
                resp2 = sc.nextInt();
            }
            //---------------------------------------------//

            if (resp2 == 1) {
                while (resp4.equalsIgnoreCase("s")){
                    System.out.print("Enter a folder path: ");
                    String strPath = sc.next();
                    sc.nextLine();
                    try{
                        File pathReader = new File(strPath);
                        File[] folders = pathReader.listFiles(File::isDirectory);
                        System.out.println("FOLDERS: ");
                        for (File folder : folders) {
                            System.out.println(folder);
                        }
                    } catch (NullPointerException e) {
                        System.out.println("ERROR: Folder not found.");
                    }
                    System.out.print("Continue writing? [S|N]: ");
                    resp4 = sc.next();
                    sc.nextLine();

                    while (!resp4.equalsIgnoreCase("s") && !resp4.equalsIgnoreCase("n")) {
                        System.out.print("Invalid answer, continue removing? [S|N]: ");
                        resp4 = sc.next();
                        sc.nextLine();
                    }
                }

            }

            //---------------------------------------------//

            else if (resp2 == 2) {
                System.out.print("File to read: ");
                sc.nextLine();
                path = sc.nextLine();
                try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                    String line = br.readLine();
                    System.out.println("-=-".repeat(8));
                    while (line != null) {
                        System.out.print(lineCount + "- ");
                        System.out.println(line);
                        line = br.readLine();
                        lineCount += 1;
                    }
                    lineCount = 1;
                } catch (IOException e) {
                    System.out.println("-=-".repeat(8));
                    System.out.println("Error: " + e.getMessage());
                }
            }

            //---------------------------------------------//

            else if (resp2 == 3) {
                System.out.print("Add line/Create file | Delete file | Remove line? [A|D|R]: ");
                resp3 = sc.next();
                sc.nextLine();

                if (resp3.equalsIgnoreCase("a")) {
                    while (resp4.equalsIgnoreCase("s")) {
                        System.out.print("Chose a (.txt) file or create a new to write: ");
                        String txtPath = sc.nextLine();
                        System.out.print("Write something: ");
                        String[] lines = new String[]{sc.nextLine()};
                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(txtPath, true))) {
                            for (String line : lines) {
                                bw.write(line);
                                bw.newLine();
                            }

                            System.out.println("Done!");

                            System.out.print("Continue writing? [S|N]: ");
                            resp4 = sc.next();
                            sc.nextLine();

                            while (!resp4.equalsIgnoreCase("s") && !resp4.equalsIgnoreCase("n")) {
                                System.out.print("Invalid answer, continue removing? [S|N]: ");
                                resp4 = sc.next();
                                sc.nextLine();
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

                //---------------------------------------------//

                else if (resp3.equalsIgnoreCase("d")) {
                    while (resp4.equalsIgnoreCase("s")) {
                        System.out.print("Enter a file path to delete: ");
                        Path deletePath = Paths.get(sc.next());
                        sc.nextLine();
                        try {
                            Files.delete(deletePath);

                            System.out.println("Done!");

                        } catch (IOException e) {
                            System.out.println("ERROR: File not found.");
                        }
                        System.out.print("Continue removing? [S|N]: ");
                        resp4 = sc.next();
                        sc.nextLine();

                        while (!resp4.equalsIgnoreCase("s") && !resp4.equalsIgnoreCase("n")) {
                            System.out.print("Invalid answer, continue removing? [S|N]: ");
                            resp4 = sc.next();
                            sc.nextLine();
                        }
                    }

                }


                //---------------------------------------------//

                else if (resp3.equalsIgnoreCase("r")) {
                    while (resp4.equalsIgnoreCase("s")) {
                        System.out.print("Enter a file path: ");
                        inputPath = sc.next();
                        sc.nextLine();
                        Path filePath = Paths.get(inputPath);
                        System.out.print("Enter line index to remove: ");
                        try {
                            lineToRemove = sc.nextInt() - 1;
                            List<String> lines = Files.readAllLines(filePath);
                            if (lineToRemove >= 0 && lineToRemove < lines.size()) {
                                lines.remove((int) lineToRemove);
                                Files.write(filePath, lines);

                                System.out.println("Removing...");

                                System.out.print("Continue removing? [S|N]: ");
                                resp4 = sc.next();
                                sc.nextLine();

                                while (!resp4.equalsIgnoreCase("s") && !resp4.equalsIgnoreCase("n")) {
                                    System.out.print("Invalid answer, continue removing? [S|N]: ");
                                    resp4 = sc.next();
                                    sc.nextLine();
                                }
                            } else {
                                System.out.println("ERROR: Line index out of bounds.");
                            }
                        } catch (IOException e) {
                            System.out.println("ERROR: reading or writing the file: " + e.getMessage());
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid answer, try again:");
                            sc.nextLine();
                        }
                    }
                }
            }

            //---------------------------------------------//

            else {
                System.out.println("ERROR: no");
            }
        }
    }
}