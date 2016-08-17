package com.company.Lessons_home_Work.Lesson4_Home_Work;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        System.out.println("Please write char for stop loop:");
        int loop = cr.nextInt();
        int fib;
        int a =0;
        int b =1;
        System.out.println(a);
        System.out.println(b);
        for (int i=0; i<=loop; i++){
            fib = a+b;
            a=b;
            b=fib;
            if (fib>=loop){
                break;
            }
            System.out.println(fib);
        }


    }
}
