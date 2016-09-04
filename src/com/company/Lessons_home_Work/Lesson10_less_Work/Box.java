package com.company.Lessons_home_Work.Lesson10_less_Work;

public class Box extends Square {
    private int a;

    public Box(int a) {
        this.a = a;
    }

    @Override
    public double area() {
        double S = 6 * Math.pow(a,2);
        System.out.println("Площадь куба = " + S);
        return 0.0;
    }

    @Override
    public double pirimetr() {
        double S = Math.pow(a, 3);
        System.out.println("Объем куба = " + S);
        return 0.0;
    }
}
