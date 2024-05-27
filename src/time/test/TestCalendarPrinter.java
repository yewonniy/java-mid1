package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = sc.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = sc.nextInt();
        System.out.println(year + "년 " + month + "월");

        LocalDate startDate = LocalDate.of(year, month, 1);
        LocalDate endDate = startDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i=-1; i< Period.between(startDate, endDate).getDays(); i++) {
            LocalDate ldt = startDate.plusDays(i + 1);
            System.out.print(ldt.getDayOfMonth() + " ");
            if (ldt.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
        }

    }
}
