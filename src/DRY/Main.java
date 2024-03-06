package DRY;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MyDate date = new MyDate(21, 2, 2024, "A.C", 3);
        System.out.println(date.toString());

    }

    static MyDate createDate(int day, int month, long year) {
        MyDate newDate = new MyDate();
        newDate.setYear(year);
        newDate.setMonth(month);
        newDate.setDay(day);
        return newDate;
    }

    static void printDate(MyDate date) {
        System.out.println(date.getDay() + " / " + date.getMonth() + " / " + date.getYear());
    }
}
