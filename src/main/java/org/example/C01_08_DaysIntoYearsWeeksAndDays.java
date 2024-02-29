package org.example;

public class C01_08_DaysIntoYearsWeeksAndDays {
    public static void main(String[] args) {
        // number of days - 1329;
        int days = 1329;
        int years = days/365;
        int weeks = (days % 365)/7;
        System.out.println(years);
        System.out.println(weeks);
        int daysremained = days - ((years*365)+(weeks*7));
        System.out.println(daysremained);

    }
}
