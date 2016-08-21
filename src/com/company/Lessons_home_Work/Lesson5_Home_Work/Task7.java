package com.company.Lessons_home_Work.Lesson5_Home_Work;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Task7 {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        System.out.println("Please enter the number A:");
        double A = cr.nextDouble();
        System.out.println("Please enter the number B:");
        double B = cr.nextDouble();
        System.out.println("Please enter the number C:");
        double C = cr.nextDouble();

        if (checkA(A) == 0){
            System.exit(0);
        }

        double Disc = findDiscriminant(A, B, C);
        if (Disc < 0){
            discriminantLessThenZero(Disc);
        }else {
            if (Disc == 0){
                discriminantEqualToZero(B, A);
            }else {
                discriminantBiggerThenZero(A, B, Disc);
            }
        }

    }

    public static int checkA(double A) {
        int k = 0;
        if (A == 0){
            System.out.println("The number A can't be ZERO.\nPlease try again!");
            k = 0;
        }else {
            System.out.println("We can try to decide this the equation");
            k = 1;
        }
        return k;
    }

    public static double findDiscriminant(double A, double B, double C){
        double D = pow(B, 2) - 4 * A * C;
        System.out.println("Discriminant is " + D);
        return D;
    }

    public static void discriminantLessThenZero(double D){
        System.out.println("We don't have any real roots");
    }

    public static double discriminantEqualToZero(double B, double A){
        double X = -B / 2 * A;
        System.out.println("One real root, ant it is " + X);
        return X;
    }

    public static void discriminantBiggerThenZero(double A, double B, double D){
        double X1 = -B + D / 2 * A;
        double X2 = -B - D / 2 * A;
        System.out.println("The first real root, ant it is " + X1);
        System.out.println("The second real root, ant it is " + X2);
    }

}
