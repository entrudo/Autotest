package com.company.Lesson2_home_Work.Lesson2_Home_Work;

import java.util.Scanner;

public class calculation_time {
    public static void main(String[] args){
        Scanner cr = new Scanner(System.in);
        System.out.println("Please enter the number of seconds:");
        int sec = cr.nextInt();
        System.out.println("Please enter the number of days:");
        int days = cr.nextInt();
        System.out.println("Please enter the number of hours:");
        int hours = cr.nextInt();
        System.out.println("Please enter the number of minutes:");
        int min = cr.nextInt();
        System.out.println("Please enter your age:");
        int age = cr.nextInt();
        System.out.println("");
        SecTo(sec);
        System.out.println("");
        DaysTo(days);
        System.out.println("");
        HoursTo(hours);
        System.out.println("");
        MinutsTo(min);
        System.out.println("");
        AgeTo(age);

    }

    public static double SecTo(int sec){
        double days = ((sec/60d)/60d)/24d;
        double hours = (sec/60d)/60d;
        double mins = sec/60d;
        System.out.println("Days in seconds are " + days);
        System.out.println("Hours in seconds are " + hours);
        System.out.println("Minutes in seconds are " + mins);
        return 0;
    }

    public static double DaysTo(int days) {
        double sec = ((days * 24d) * 60d) * 60d;
        double hours = days / 24d;
        double mins = (days * 24d) * 60d;
        System.out.println("Hours in days are " + hours);
        System.out.println("Minutes in days are " + mins);
        System.out.println("Seconds in days are " + sec);
        return 0;
    }

    public static double HoursTo(int hours) {
        double days = hours/24d;
        double sec = (hours * 60d) * 60d;
        double mins = hours * 60d;
        System.out.println("Days in hours are " + days);
        System.out.println("Minutes in hours are " + mins);
        System.out.println("Seconds in hours are " + sec);
        return 0;
    }

    public static double MinutsTo(int min) {
        double days = (min / 60d) / 24d;
        double hours = min / 60d;
        double sec = min * 60d;
        System.out.println("Days in Minutes are " + days);
        System.out.println("Hours in Minutes are " + hours);
        System.out.println("Seconds in Minutes are " + sec);
        return 0;
    }

    public static double AgeTo(int age) {
        double days = (age * 365d) * 24d;
        long hours = age * 365L * 24L * 60L;
        long min = age *365L*24L*60L*60L;
        long sec = age *365L*24L*60L*60L*60L;
        System.out.println("Days in your Age are " + days);
        System.out.println("Hours in your Age are " + hours);
        System.out.println("Minutes in your Age are " + min);
        System.out.println("Seconds in your Age are " + sec);
        return 0;
    }
}
