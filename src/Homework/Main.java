package Homework;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Main {
    public static void main(String[] args){

        LocalDate date = LocalDate.now();
        System.out.println(date);

        /* 2023-03-27 */

        //System.out.println(LocalDate.("2023-03-27").getDayofMonth());


        LocalDate now = LocalDate.now();
        System.out.println("Today is "+ now);

        /*Today is 2023-03-27 */

        LocalDate dateParse = LocalDate.parse("1990-02-15");
        System.out.println("My birthday is "+dateParse);

        /* My birthday is 1990-02-15 */

        boolean before = LocalDate.now().isBefore(LocalDate.parse("2011-03-07"));
        boolean after = LocalDate.now().isAfter(LocalDate.parse("2011-03-07"));
        System.out.println(before);
        System.out.println(after);

        /* false
           true
           */
        LocalTime timeNow = LocalTime.now();
        System.out.println("Time now is "+timeNow);

        /* Time now is 18:38:05.944464200 */

      //  LocalTime nineteen = twentytwo.plus(3, ChronoUnit.HOURS);
       // System.out.println(nineteen);


        LocalDate mondayOnPreviousWeek = LocalDate.now().minusWeeks(1).with(DayOfWeek.MONDAY);
        System.out.println(mondayOnPreviousWeek);

        /* 2023-03-20 */

        LocalDate mondayOnPreviousYear = LocalDate.now().minusYears(1).withDayOfYear(27);
        System.out.println(mondayOnPreviousYear);

        /*2022-01-27 */

        LocalDate mondayOnPreviousYear1 = LocalDate.now().plusYears(1).withDayOfYear(27);
        System.out.println(mondayOnPreviousYear1);

        /*2024-01-27 */

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("Tomorrow is "+ tomorrow);

        /*Tomorrow is 2023-03-28 */

        LocalDate yesterday = LocalDate.now().minusDays(1);
        System.out.println(" yesterday is "+ yesterday);

        /* yesterday is 2023-03-26 */

        boolean before = LocalDate.now().isBefore(LocalDate.parse("2011-03-28"));
        boolean after = LocalDate.now().isAfter(LocalDate.parse("2011-03-26"));
        System.out.println(before);
        System.out.println(after);
        /* false
        true */


    }
}
