package s12_Enumeracoes_composicao.Enumeracoes.exercicio02;

import s12_Enumeracoes_composicao.Enumeracoes.exercicio02.entities.Comment;
import s12_Enumeracoes_composicao.Enumeracoes.exercicio02.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("How that's awesome!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44 "),
                "traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12 );
        p1.addComments(c1);
        p1.addComments(c2);
        System.out.println(p1);

    }

    }


