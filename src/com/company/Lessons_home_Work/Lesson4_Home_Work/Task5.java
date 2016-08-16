package com.company.Lessons_home_Work.Lesson4_Home_Work;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        System.out.println("Please write a length of array:");
        int size = cr.nextInt();
        int[] arr = new int[size];
        System.out.println("Please write each element of array:");
        for (int i =0; i<arr.length; i++){
            arr[i]=cr.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sort arr:");
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
