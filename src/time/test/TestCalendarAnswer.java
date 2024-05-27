package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = sc.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = sc.nextInt();
        System.out.println(year + "년 " + month + "월");

        printCalendar(year, month);
    }

    private static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1); // 다음달 첫날

        // 월요일 = 1 (1%7=1) ... 일요일 = 7 (7%7=0)
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa ");
        for (int i=0; i < offsetWeekDays; i++) {
            System.out.print("   "); // 세칸씩 뛰기
        }

        LocalDate dayIterater = firstDayOfMonth;
        while (dayIterater.isBefore(firstDayOfNextMonth)) {
            System.out.printf("%2d ", dayIterater.getDayOfMonth()); // 두 칸 차지하도록 출력 ( + 이후 띄어쓰기 한 칸)
            if (dayIterater.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dayIterater = dayIterater.plusDays(1);
        }
    }
}
