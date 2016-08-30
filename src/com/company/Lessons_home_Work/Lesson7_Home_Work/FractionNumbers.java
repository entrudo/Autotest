package com.company.Lessons_home_Work.Lesson7_Home_Work;

public class FractionNumbers {
        private int A = 0;
        private int B = 0;

    public FractionNumbers(int a, int b) {
        A = a;
        B = b;
    }

    public int Plus(){
        return A + B;
    }

    public int Minus(){
        return A - B;
    }

    public int Multiply(){
        return A * B;
    }

    public int Divide(){
        return A / B;
    }

    @Override
    public String toString() {
        return "FractionNumbers{" +
                "A=" + A +
                ", B=" + B +
                '}';
    }

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FractionNumbers that = (FractionNumbers) o;

        if (A != that.A) return false;
        return B == that.B;

    }
}
