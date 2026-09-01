package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program3 {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2026-08-18");
        LocalDateTime d05 = LocalDateTime.parse("2026-08-18T01:30:26");
        Instant d06 = Instant.parse("2026-08-18T01:30:26Z");

        for (String s: ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }

        LocalDate r2d2 = LocalDate.ofInstant(d06,ZoneId.systemDefault());
        LocalDate r1d1 = LocalDate.ofInstant(d06,ZoneId.of("Portugal"));
        LocalDateTime r4d4 = LocalDateTime.ofInstant(d06,ZoneId.systemDefault());
        LocalDateTime r3d3 = LocalDateTime.ofInstant(d06,ZoneId.of("Portugal"));


        System.out.println("r2d2: " +r2d2);
        System.out.println("r1d1: " +r1d1);
        System.out.println("r3d3: " +r3d3);
        System.out.println("r4d4: " +r4d4);
        System.out.println("dia do d04: " +d04.getDayOfMonth());
        System.out.println("mes do d04: "+d04.getMonthValue());
        System.out.println("ano do d04: "+d04.getYear());

        System.out.println("hora do d05: "+d05.getHour());
        System.out.println("minuto do d05: "+d05.getMinute());
    }

    }
