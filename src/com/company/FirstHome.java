package com.company;

import java.util.Scanner;

public class FirstHome {

    public static void main(String[] args) {
	// write your code here

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
}
