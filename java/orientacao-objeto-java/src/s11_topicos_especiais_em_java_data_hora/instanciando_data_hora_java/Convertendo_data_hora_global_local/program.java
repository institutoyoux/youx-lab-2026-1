package s11_topicos_especiais_em_java_data_hora.instanciando_data_hora_java.Convertendo_data_hora_global_local;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class program {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d06,ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDate r3 = LocalDate.ofInstant(d06,ZoneId.systemDefault());
        LocalDate r4 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2 );
        System.out.println("r3 = " + r3 );
        System.out.println("r4 = " + r4 );

        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mes = " +  d04.getMonthValue());
        System.out.println("d04 mes = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());


       }

}
