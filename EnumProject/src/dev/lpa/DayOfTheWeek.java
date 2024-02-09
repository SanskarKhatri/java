package dev.lpa;

public enum DayOfTheWeek {
    SUN, MON, TUES, WED, THURS, FRI, SAT;
    public int getNumber() {
        return this.ordinal() + 1;
    }
}
