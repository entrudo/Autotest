package com.company.Lessons_home_Work.Lesson3_Home_Work;


import java.util.Scanner;

public class Home_Work1 {
    public static void main(String[] args){
        Scanner cr = new Scanner(System.in);
        System.out.println("Please enter the mark:");
        int i = cr.nextInt();
        if (i>=50){
            System.out.println("PASS");
        }else {System.out.println("FAIL");}
        System.out.println("DONE");
    }
}
