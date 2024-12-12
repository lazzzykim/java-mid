package mid1.time.test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class TestPlus {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        LocalDateTime dateTime = ldt.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println(dateTime);
    }
}
