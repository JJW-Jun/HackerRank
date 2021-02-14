package demo.study.Date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class Date {
    public static void main(String args[]) {
        try {
            LocalDateTime localDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        } catch (DateTimeParseException e) {
            e.printStackTrace();

        }
        LocalDate oldDate = LocalDate.of(2004, 07, 03);
        LocalDate recent = LocalDate.of(2020, 07, 03);

        Period period = Period.between(oldDate, recent);
        long days = ChronoUnit.DAYS.between(oldDate, recent);
        System.out.println(days);
        System.out.println(period.getYears()+"년" + " "+period.getMonths()+"월 차이");
        Instant start = Instant.now();

        Instant end = Instant.now();
    }
}
