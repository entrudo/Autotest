package com.company.Lessons_home_Work.Lesson3_Home_Work;

import java.util.Scanner;

public class Home_Work9 {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        System.out.println("Please enter the number X:");
        double x = cr.nextDouble();
        double n;
        n = Math.sqrt(x);
        if (n == (int) n){
            System.out.println("X is a perfect square");
        }else {
            System.out.println("X isn't a perfect square");
        }

    }
}
