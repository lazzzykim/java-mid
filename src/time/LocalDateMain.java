package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate localDate = LocalDate.of(2014, 11, 12);
        System.out.println(nowDate);
        System.out.println(localDate);
    }
}
