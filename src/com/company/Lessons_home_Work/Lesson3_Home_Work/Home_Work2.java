package com.company.Lessons_home_Work.Lesson3_Home_Work;


import java.util.Scanner;

public class Home_Work2 {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int i = cr.nextInt();
        if (i%2==0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
        System.out.println("BYE");
    }

}
