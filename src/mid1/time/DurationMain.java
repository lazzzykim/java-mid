package mid1.time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {

    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);

        LocalTime localTime = LocalTime.of(1, 0);
        System.out.println("localTime = " + localTime);

        //계산
        LocalTime plusTIme = localTime.plus(duration);
        System.out.println("더한 시간: " + plusTIme);

        // 시간 차이
        LocalTime localTime1 = LocalTime.of(9, 0);
        LocalTime localTime2 = LocalTime.of(10, 0);
        Duration between = Duration.between(localTime1, localTime2);
        System.out.println("차이 : " + between.getSeconds() + "초");
        System.out.println("근무 시간 : " + between.toHours() + "시간" + between.toMinutesPart() + "분");
    }
}
