package com.company.Lessons_home_Work.lesson6_Hpme_work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args)  throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the word:");
        String word = reader.readLine();
        String temp = "";
        for (int i = 0; i < word.length()-1; i++){
            word = word.substring(1) + word.substring(0, 1);
            System.out.println(word);

        }
    }
}
