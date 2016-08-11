package com.company.Lessons_home_Work.Lesson3_Home_Work;

import java.util.Scanner;

public class Home_Work6 {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        System.out.println("Please enter the number X:");
        int x = cr.nextInt();
        System.out.println("Please enter the number Y:");
        int y = cr.nextInt();
        if (x % y == 0) {
            System.out.println("X divides evenly into Y");
        } else {
            System.out.println("X does not divide evenly into Y");
        }
    }
}
