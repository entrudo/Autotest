package com.company.Lessons_home_Work.Lesson10_less_Work;

public class Cilinder extends Circle {
    private int r;
    private int h;

    public Cilinder(int r, int h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public double pirimetr() {
        double V = Math.PI * Math.pow(r, 2) * h;
        System.out.println("Объем цилиндра = " + V);
        return 0.0;
    }

    @Override
    public double area() {
        double S = 2 * Math.PI * r * h;
        System.out.println("Площадь цилиндра = " + S);
        return 0.0;
    }
}
