package com.company.Lessons_home_Work.Lesson4_Home_Work;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[36];
        int n = 0;
        for (int i = 0; i<arr.length; i++){
            arr[i] = n;
            n +=10;
        }
        System.out.println("Sin from each 10 degree from 0 to 360:");
        for (int i=0; i<arr.length; i++){
            System.out.println(Math.sin(arr[i]));
        }

    }
}
