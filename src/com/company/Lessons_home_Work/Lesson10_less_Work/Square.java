package com.company.Lessons_home_Work.Lesson10_less_Work;

/**
 * Created by Ent on 04.09.2016.
 */
public class Square extends Shape {
    protected int a;

    public Square() {
    }

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double area() {
        double S = Math.pow(a, 2);
        System.out.println("Площадь квадрата = " + S);
        return 0.0;
    }
}
