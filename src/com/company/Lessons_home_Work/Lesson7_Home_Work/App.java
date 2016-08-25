package com.company.Lessons_home_Work.Lesson7_Home_Work;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter number A:");
        int A = Integer.parseInt(reader.readLine());
        System.out.println("Please enter number B:");
        int B = Integer.parseInt(reader.readLine());

        FractionNumbers fractionNumbers = new FractionNumbers(A, B);

        System.out.println("Method Plus: " + fractionNumbers.Plus(A, B));
        System.out.println("Method Minus: " + fractionNumbers.Minus(A, B));
        System.out.println("Method Multiply: " + fractionNumbers.Multiply(A, B));
        System.out.println("Method Divide: " + fractionNumbers.Divide(A, B));


        System.out.println(fractionNumbers);
    }
}
