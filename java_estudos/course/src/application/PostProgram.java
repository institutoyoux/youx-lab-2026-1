package application;

import entities.Comentario;
import entities.Post;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PostProgram {
    void main() {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Comentario c1 = new Comentario("Tenha uma boa viagem!");
        Comentario c2 = new Comentario("Uau,isso e incrivel");

        LocalDateTime data = LocalDateTime.parse("21/06/2018 13:05:44",formatador);

        Post p1 = new Post(data,"Traveling to the New Zealand","I'm going to visit this wonderful country!",12);

        p1.addComentario(c1);
        p1.addComentario(c2);

        System.out.println(p1);
    }
}
