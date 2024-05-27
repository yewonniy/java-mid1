package time;

import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(8, 6, 2);

        System.out.println("현재 시간 = " +nowTime);
        System.out.println("지정 시간 = " +ofTime);

        LocalTime ofTimePlus = ofTime.plusSeconds(8);
        System.out.println("지정 시간 + 8ms = " +ofTimePlus);
    }
}
