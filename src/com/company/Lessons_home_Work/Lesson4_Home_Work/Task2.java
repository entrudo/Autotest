package com.company.Lessons_home_Work.Lesson4_Home_Work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException{
        Scanner cr = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please write the umber in the decimal system");
        int number10 = cr.nextInt();
        System.out.println("Please write the umber in the hex system");
        String number16 = br.readLine();
        System.out.println("The number in the decimal is "+number10+" in the hex system is " + Integer.toHexString(number10));
        System.out.println("The number in the hex is "+number16+" in the decimal system is " + Integer.parseInt(number16, 16));

    }
}
