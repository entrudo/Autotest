package com.company.Lessons_home_Work.Lesson6_Home_Work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the sentence:");
        String word = reader.readLine();
        System.out.println("Please enter the remote letter:");
        String charr = reader.readLine();

        System.out.println(word.replace(charr, ""));
    }
}
