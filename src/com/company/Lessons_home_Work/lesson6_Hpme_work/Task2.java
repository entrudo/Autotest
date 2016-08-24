package com.company.Lessons_home_Work.lesson6_Hpme_work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the word:");
        String word = reader.readLine();

        System.out.println("Amount of character in the word is " + word.length());

    }
}
