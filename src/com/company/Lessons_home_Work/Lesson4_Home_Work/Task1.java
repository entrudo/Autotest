package com.company.Lessons_home_Work.Lesson4_Home_Work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner cr = new Scanner(System.in);
        System.out.println("Please write a number in the decimal system:");
        int number = cr.nextInt();
        System.out.println("Please enter number in the binary system:");
        String number2 = br.readLine();
        System.out.println("Number in the decimal is " + number + " in the binary is " + Integer.toBinaryString(number));
        System.out.println("Number in the binary is " + number2 + " in the decimal is "+ Integer.parseInt(number2, 2));
    }
}
