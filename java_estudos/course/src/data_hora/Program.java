package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d01 = LocalDate.now(); // Instancia a data.
        LocalDateTime d02 = LocalDateTime.now(); // Instancia o tempo com data e horario.
        Instant d03 = Instant.now(); // Instancia o tempo com data e horario, mas no horario de Londres.
        // O método parse é utilizado quando há a necessidade de criar um objeto
        //  com um horário específico através de uma hora em formato string.
        LocalDate d04 = LocalDate.parse("2026-08-21");
        LocalDateTime d05 = LocalDateTime.parse("2026-08-21T01:30:26");
        Instant d06 = Instant.parse("2026-08-21T04:30:26Z");
        LocalDate d07 = LocalDate.parse("20/07/2022", fmt1);


        System.out.println("data: " + d01);
        System.out.println("data e horario: " + d02);
        System.out.println("data e horario (no horario de Londres): " + d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);

    }
}