package javaEssential.ex21;

import java.util.Calendar;

public class CalTime {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        calendar.add(Calendar.SECOND, 120);
        System.out.println(calendar.getTime());
    }
}
