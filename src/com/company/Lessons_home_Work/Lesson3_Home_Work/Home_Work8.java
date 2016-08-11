package com.company.Lessons_home_Work.Lesson3_Home_Work;

import java.util.Scanner;

public class Home_Work8 {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        System.out.println("Please enter the number X:");
        double x = cr.nextInt();
        System.out.println("Please enter the number Y:");
        double y = cr.nextInt();
        if (x>y){
            System.out.println("The number "+ x +" has the greatest value");
        }else {
            System.out.println("The number "+ y +" has the greatest value");
        }
    }
}
