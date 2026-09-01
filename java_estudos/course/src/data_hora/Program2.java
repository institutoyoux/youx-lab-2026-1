package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program2 {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2026-08-18");
        LocalDateTime d05 = LocalDateTime.parse("2026-08-18T01:30:26");
        Instant d06 = Instant.parse("2026-08-18T01:30:26Z");



        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());


        System.out.println(d04);
        System.out.println("d04: " +d04.format(fmt1)); // data formatada
        System.out.println(d05);
        System.out.println("d05: " +d05.format(fmt2)); // data e hora formatadas
        System.out.println(d06);
        System.out.println("d06: " +fmt3.format(d06)); // data e hora formatadas para o fuso horario do meu sistema (Br)
    }

}
