package data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program4 {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2026-08-18");
        LocalDateTime d05 = LocalDateTime.parse("2026-08-18T01:30:26");
        Instant d06 = Instant.parse("2026-08-18T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);// Semana passada da data escrita no d04
        LocalDate nextWeekLocalDate = d04.plusDays(7); // Semana que vem da data escrita no d04
        LocalDate nextYearLocalDate = d04.plusYears(7); //  7 anos que vem

        System.out.println("Data da semana passada: "+pastWeekLocalDate);
        System.out.println("Data da semana que vem: "+nextWeekLocalDate);
        System.out.println("7 anos no futuro: " +nextYearLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("Data da semana passada,com data e hora: "+pastWeekLocalDateTime);
        System.out.println("Data da semana que vem,com data e hora: "+nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("Data da semana passada em Londres: "+pastWeekInstant);
        System.out.println("Data da semana que vem em Londres: "+nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDateTime,d05);

        System.out.println("Dias entre semana passada e hoje (em Instant): "+t1.toDays());


    }

}
