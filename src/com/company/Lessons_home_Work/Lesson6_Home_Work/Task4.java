package com.company.Lessons_home_Work.Lesson6_Home_Work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the sentence:");
        String word = reader.readLine();
        String[] amount = word.split(" ");
        System.out.println("Amount of word in the sentence is " + amount.length);
        for (int i = 0; i < amount.length; i++){
            System.out.println("Amount of character in the word № " + (i+1) + " is " + amount[i].length());
        }


    }
}
