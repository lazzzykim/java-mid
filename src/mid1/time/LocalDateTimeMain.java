package mid1.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime nowTime = LocalDateTime.now();
        LocalDateTime ofTime = LocalDateTime.of(2020, 4, 20, 8, 10, 1);
        System.out.println(nowTime);
        System.out.println(ofTime);

        LocalDate localDate = ofTime.toLocalDate();
        LocalTime localTime = ofTime.toLocalTime();
        System.out.println(localDate);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = ofTime.plusDays(100);
        System.out.println("지정 + plus " + localDateTime1);
        LocalDateTime localDateTime2 = ofTime.plusYears(3);
        System.out.println("연 " + localDateTime2);

        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이전인가?" + nowTime.isBefore(ofTime));
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이후인가?" + nowTime.isAfter(ofTime));
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이후인가?" + nowTime.isEqual(ofTime));

    }
}
