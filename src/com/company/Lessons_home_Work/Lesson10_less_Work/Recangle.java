package com.company.Lessons_home_Work.Lesson10_less_Work;

/**
 * Created by Ent on 04.09.2016.
 */
public class Recangle extends Square {
    private int b;
    private int c;

    public Recangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double S = a*b;
        System.out.println("Площадь прямоугольника = " + S);
        return 0.0;
    }

    @Override
    public double pirimetr() {
        double S = a*b*c;
        System.out.println("Объем параллелепипеда = " + S);
        return 0.0;
    }
}
