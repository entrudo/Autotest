package com.company.Lessons_home_Work.Lesson10_less_Work;

public class Sphere extends Circle {

    public Sphere(int r) {
        this.r = r;
    }

    @Override
    public double pirimetr() {
        double V = 4/3 * Math.PI * Math.pow(r, 3);
        System.out.println("Объем шара = " + V);
        return 0.0;
    }

    @Override
    public double area() {
        double S = 4 * Math.PI * Math.pow(r, 2);
        System.out.println("Площадь шара = " + S);
        return 0.0;
    }
}
