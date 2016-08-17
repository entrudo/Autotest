package com.company.Lessons_home_Work.Lesson4_Home_Work;


import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Please write a palindrome world:");
        Scanner cr = new Scanner(System.in);
        String world = cr.nextLine();
        System.out.println("The world " + isPalindrome(world) + " is palindrome.");

    }

    public static String isPalindrome(String world){
        int lenght = world.length();
        for (int i = 0; i<lenght/2; i++){
            if (world.charAt(i) != world.charAt(lenght -i -1)){
                return "World isn't palindrome";
            }
        }
        return world;
    }
}
