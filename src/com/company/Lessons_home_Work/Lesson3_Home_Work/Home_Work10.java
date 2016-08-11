package com.company.Lessons_home_Work.Lesson3_Home_Work;

import java.util.Scanner;

import static java.lang.Math.*;

public class Home_Work10 {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        System.out.println("Please enter the number A:");
        double A = cr.nextDouble();
        System.out.println("Please enter the number B:");
        double B = cr.nextDouble();
        System.out.println("Please enter the number C:");
        double C = cr.nextDouble();

        if (A==0){
            System.out.println("The number A can't be ZERO.");
        }else {
            // Find discriminant
            double D = pow(B, 2) - 4 * A * C;
            System.out.println("Discriminant is " + D);
            if (D == 0) {
                double X = -B / 2 * A;
                System.out.println("One real root, ant it is " + X);
            } else if (D > 0) {
                double X1 = -B + D / 2 * A;
                double X2 = -B - D / 2 * A;
                System.out.println("The first real root, ant it is " + X1);
                System.out.println("The second real root, ant it is " + X2);
            }
            if (D < 0) {
                System.out.println("We don't have any real roots");
            }
        }

    }
}
