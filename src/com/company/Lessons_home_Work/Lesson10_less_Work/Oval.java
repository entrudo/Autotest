package com.company.Lessons_home_Work.Lesson10_less_Work;

public class Oval extends Circle {
    private int a;
    private int b;
    private int c;

    public Oval(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double S = Math.PI * a * b;
        System.out.println("Площадь эллипса = " + S);
        return 0.0;
    }

    @Override
    public double pirimetr() {
        double V = 4/3 * Math.PI * a * b * c;
        System.out.println("Объем эллипса = " + V);
        return 0.0;
    }
}
