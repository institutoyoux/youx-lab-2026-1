import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();
//        /home/youx/Documentos
        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders){
            System.out.println(folder);
        }
        System.out.print("Digite oque quer escrever: ");
        String[] lines = new String[] {sc.nextLine()};
        System.out.println("");
        System.out.print("Digite o caminho (/home/teste.txt): ");
        String path1 = sc.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path1, true))) {
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        } ;

    }
}