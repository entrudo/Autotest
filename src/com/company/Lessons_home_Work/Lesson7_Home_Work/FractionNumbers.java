package com.company.Lessons_home_Work.Lesson7_Home_Work;

public class FractionNumbers {
        private int A = 0;
        private int B = 0;

    public FractionNumbers(int a, int b) {
        A = a;
        B = b;
    }

    public int Plus(int A, int B){
        return A + B;
    }

    public int Minus(int A, int B){
        return A - B;
    }

    public int Multiply(int A, int B){
        return A * B;
    }

    public int Divide(int A, int B){
        return A / B;
    }

    @Override
    public String toString() {
        return "FractionNumbers{" +
                "A=" + A +
                ", B=" + B +
                '}';
    }


}
