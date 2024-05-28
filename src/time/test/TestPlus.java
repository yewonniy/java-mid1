package time.test;

import java.time.LocalDateTime;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        // 1년 2개월 3일 4시간 후의 시각
        LocalDateTime after = now.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("now = " + now);
        System.out.println("after = " + after);
    }
}
