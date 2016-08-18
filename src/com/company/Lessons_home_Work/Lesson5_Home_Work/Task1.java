package com.company.Lessons_home_Work.Lesson5_Home_Work;

import java.util.Scanner;

/**
 * Created by Ent on 18.08.2016.
 */
public class Task1 {
    public static void main(String[] args) {

        Scanner cr = new Scanner(System.in);
        System.out.println("Please enter the Fahrenheit degree:");
        int F = cr.nextInt();
        System.out.println("Please enter the Celsius degree:");
        int C = cr.nextInt();
        System.out.println("Please enter the Kelvin degree:");
        int K = cr.nextInt();
        System.out.println(CelToFar(C));
        System.out.println(FarToCel(F));
        System.out.println(CelToKel(C));
        System.out.println(KelToCel(K));

    }
    //Конвертация Цельсия в Фарингейт
    public static double CelToFar(double C){
        double F=(9/5d*C)+32;
        return F;
    }

    //Конвертация Фарингейт в Цельсия
    public static double FarToCel(double F){
        double C=5*(F-32)/9;
        return C;
    }

    //Конвертация Цельсия в Келвин
    public static double CelToKel(double C){
        double K=C+273.16d;
        return K;
    }

    //Конвертация Келвин в Цельсия
    public static double KelToCel(double K){
        double C=K-273.16d;
        return C;
    }
}
