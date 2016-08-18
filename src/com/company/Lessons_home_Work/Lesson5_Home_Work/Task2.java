package com.company.Lessons_home_Work.Lesson5_Home_Work;

import java.util.Scanner;

/**
 * Created by Ent on 18.08.2016.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        System.out.println("Please enter the meter");
        int Met = cr.nextInt();
        System.out.println("Please enter the inches");
        int Inc = cr.nextInt();
        System.out.println("Please enter the mile");
        int Mil = cr.nextInt();
        System.out.println("Please enter the kilometre");
        int Kil = cr.nextInt();

        System.out.println(MetrsToInch(Met));
        System.out.println(InchToMetrs(Inc));
        System.out.println(MilesToKilometrs(Mil));
        System.out.println(KilometrsToMiles(Kil));
    }

    public static double MetrsToInch(int Met){
        System.out.println("Convert meters to inches");
        double Inc2 = (Met*100)/2.54;
        return Inc2;
    }

    public static double InchToMetrs(int Inc){
        System.out.println("Convert inches to meters");
        double Met2 = (Inc*2.54)/100;
        return Met2;
    }

    public static double MilesToKilometrs(int Mil){
        System.out.println("Convert miles to kilometres");
        double Mil2=Mil*1.60934d;
        return Mil2;
    }

    public static double KilometrsToMiles(int Kil){
        System.out.println("Convert kilometres to miles");
        double Kil2=Kil/1.60934d;
        return Kil2;
    }
}
