package com.company.Lessons_home_Work.Lesson10_less_Work;

public class Pyramid extends Triongle {

    private int S;
    private int h;
    private int L;
    private int P;
    private int osnS;

    public Pyramid(int s, int h, int l, int p, int osnS) {
        S = s;
        this.h = h;
        L = l;
        P = p;
        this.osnS = osnS;
    }

    @Override
    public double area() {
        double S = 1/2 * P * L * osnS;
        System.out.println("Площадь полной поверхности правильной пирамиды = " + S);
        return 0.0;
    }

    @Override
    public double pirimetr() {
        double V = 1/3 * S *h;
        System.out.println("Объем пирамиды = " + V);
        return 0.0;
    }
}

