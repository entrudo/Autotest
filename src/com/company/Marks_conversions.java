package com.company;


import java.util.Scanner;

public class Marks_conversions {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        System.out.println("Please enter the first mark");
        double Fmar = cr.nextInt();
        System.out.println("Please enter the second mark");
        double Smar = cr.nextInt();
        double Per = (Fmar/Smar)*100;
        System.out.println("Percentage is " + Per + "%");
    }
}
