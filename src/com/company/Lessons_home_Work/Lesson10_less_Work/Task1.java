package com.company.Lessons_home_Work.Lesson10_less_Work;

public class Task1 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Cilinder cilinder = new Cilinder(10, 15);
        Oval oval = new Oval(10, 12, 20);
        Sphere sphere = new Sphere(15);
        Square square = new Square(17);
        Recangle recangle = new Recangle(10, 12, 20);
        Box box = new Box(18);
        Triongle triongle = new Triongle(10, 26);
        Pyramid pyramid = new Pyramid(5, 9, 15, 17, 20);
        System.out.println("======================================================");
        circle.area();
        System.out.println("------------------------------------------------------");
        cilinder.area();
        cilinder.pirimetr();
        System.out.println("------------------------------------------------------");
        oval.area();
        oval.pirimetr();
        System.out.println("------------------------------------------------------");
        sphere.area();
        sphere.pirimetr();
        System.out.println("======================================================");
        square.area();
        System.out.println("------------------------------------------------------");
        recangle.area();
        recangle.pirimetr();
        System.out.println("------------------------------------------------------");
        box.area();
        box.pirimetr();
        System.out.println("======================================================");
        triongle.area();
        System.out.println("------------------------------------------------------");
        pyramid.area();
        pyramid.pirimetr();
        System.out.println("======================================================");
    }
}
