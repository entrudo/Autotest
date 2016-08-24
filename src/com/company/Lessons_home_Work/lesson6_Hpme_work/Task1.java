package com.company.Lessons_home_Work.lesson6_Hpme_work;


import com.sun.deploy.net.UpdateTracker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the word:");
        String word = reader.readLine();

        System.out.println(upToCase(word));
        System.out.println(lowToCase(word));

        System.out.println("Please enter the sentence:");
        String sent = reader.readLine();
        System.out.println(upToEachWord(sent));

    }

    public static String upToCase(String word){
        word = word.toUpperCase();
        return word;
    }

    public static String lowToCase(String word){
        word = word.toLowerCase();
        return word;
    }

    public static String upToEachWord(String sent){
        String[] list = sent.split(" ");
        String result = "";
        for (int i = 0; i < list.length; i++){
            result = result + list[i].substring(0, 1).toUpperCase() + list[i].substring(1) + " ";
        }
        return result;
    }
}
