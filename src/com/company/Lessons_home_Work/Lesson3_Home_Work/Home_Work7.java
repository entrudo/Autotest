package com.company.Lessons_home_Work.Lesson3_Home_Work;

import java.util.Scanner;

public class Home_Work7 {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        System.out.println("Please enter the number A:");
        int A = cr.nextInt();
        System.out.println("Please enter the number B:");
        int B = cr.nextInt();
        if (A==0){
            System.out.println("You inputted A like 0, and this equation hasn't solution");
        }else {
            double x = -B/A;
            System.out.println("X equels " + x);
        }




    }
}
