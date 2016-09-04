package com.company.Lessons_home_Work.Lesson10_less_Work;

import static java.lang.Math.*;

public class Circle extends Shape {

    protected int r;

    public Circle() {

    }

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double area() {

        double S = PI * pow(r, 2);
        System.out.println("Площадь круга = " + S);

        return 0.0;
    }
}
