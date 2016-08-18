package com.company.Lessons_home_Work.Lesson4_Home_Work;


import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Please write a palindrome world:");
        Scanner cr = new Scanner(System.in);
        String world = cr.nextLine();
        System.out.println(isPalindrome(world));

    }

    public static String isPalindrome(String world){
        int lenght = world.length();
        char[] arr = new char[lenght];
        for (int i=0; i<lenght; i++){
            arr[i] = world.charAt(i);
        }
        for (int i = 0; i<lenght/2; i++){
            if (arr[i] != arr[lenght -i -1]){
                return "World "+ world +" isn't palindrome";
            }
        }
        return "The world " + world + " is palindrome.";
    }
}
