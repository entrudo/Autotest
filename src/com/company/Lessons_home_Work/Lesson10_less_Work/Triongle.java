package com.company.Lessons_home_Work.Lesson10_less_Work;


public class Triongle extends Shape {

    private int a;
    private int h;
    private double S;

    public Triongle() {
    }

    public Triongle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double area() {
        S = (double) 1/2 * a * h;
        System.out.println("Площадь треугольника = " + S);
        return S;
    }
}
