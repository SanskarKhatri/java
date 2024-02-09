
package dev.lpa;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);
        for (int i=0;i<10;i++) {
            weekDay = getRandomDay();

            System.out.printf("Name is %s, ordinal value = %d%n",weekDay.name(), weekDay.ordinal());

            switchDayOfWeek(weekDay);

        }
        for (DayOfTheWeek i : DayOfTheWeek.values()) {
            System.out.println(i.name());
        }
    }
    public static DayOfTheWeek getRandomDay() {
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }

    public static void switchDayOfWeek(DayOfTheWeek weekDay) {
        switch(weekDay) {
            case WED -> System.out.println("Wednesday is day " + weekDay.getNumber());
            case SAT -> System.out.println("Saturday is day " + weekDay.getNumber());
            default -> System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() + "day is day " + weekDay.getNumber());
        }
    }
}