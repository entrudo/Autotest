package com.company.Lessons_home_Work.Lesson4_Home_Work;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        System.out.println("Please write the world");
        String world = cr.nextLine();
        int size = world.length();
        char[] arr = new char[size];

        for (int i =0; i<arr.length; i++){
            arr[i] = world.charAt(size -i -1);
        }
        System.out.println("New world:");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }

    }
}
