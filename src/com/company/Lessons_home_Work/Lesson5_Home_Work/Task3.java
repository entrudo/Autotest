package com.company.Lessons_home_Work.Lesson5_Home_Work;

import java.util.Scanner;

/**
 * Created by Ent on 18.08.2016.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        System.out.println("Please enter the kilogram");
        int Kilo = cr.nextInt();
        System.out.println("Please enter the pound");
        int Po = cr.nextInt();

        System.out.println(PoundsToKilograms(Po));
        System.out.println(KilogramsToPounds(Kilo));
    }

    public static double PoundsToKilograms(int Po){
        System.out.println("Convert pounds to kilograms");
        double Kilo2 = Po/2.20462d;
        return Kilo2;
    }

    public static double KilogramsToPounds(int Kilo){
        System.out.println("Convert kilograms to pounds");
        double Po2=Kilo*2.20462d;
        return Po2;
    }
}
