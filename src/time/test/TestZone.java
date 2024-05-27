package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2024, 1, 1, 9, 0, 0);
        ZonedDateTime seoul = ZonedDateTime.of(dt, ZoneId.of("Asia/Seoul"));
        ZonedDateTime london = ZonedDateTime.of(dt, ZoneId.of("Europe/London"));
        ZonedDateTime newWork = ZonedDateTime.of(dt, ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간: "+ seoul);
        System.out.println("런던의 회의 시간: "+ london);
        System.out.println("뉴욕의 회의 시간: "+ newWork);

        ZonedDateTime london2 = seoul.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime newWork2 = seoul.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("런던의 회의 시간2: "+ london2);
        System.out.println("뉴욕의 회의 시간2: "+ newWork2);
    }
}
