package com.company.Lessons_home_Work.Lesson5_Home_Work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ent on 19.08.2016.
 */
public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the number A:");
        int A = Integer.parseInt(br.readLine());
        System.out.println("Please enter the number B:");
        int B = Integer.parseInt(br.readLine());
        System.out.println("X equels " + QuadraticEquation(A, B));
    }

    public static double QuadraticEquation(int A, int B) {
        double x=0;
        if (A == 0) {
            System.out.println("You inputted A like 0, and this equation hasn't solution");
        } else {
            x = -B / A;
        }
        return x;
    }
}
