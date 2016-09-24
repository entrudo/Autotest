package com.company.Lessons_home_Work.Lesson15_Less_Work.Task1;

public class Task1 {
    public static void main(String[] args) {
        Whisky whisky = Whisky.HankeyBannister;

        System.out.println("Name: " + whisky.getName());
        System.out.println("Age: " + whisky.getAge());
        System.out.println("Slod: " + whisky.isSolod());

        System.out.println("===================");

        for (Whisky m : Whisky.values()){
            System.out.println(m);
        }
    }


}
