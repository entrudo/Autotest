package com.company.Lessons_home_Work.Lesson4_Home_Work;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        System.out.println("Please write a #1 in the table:");
        String num1 = cr.nextLine();
        System.out.println("Please write a #2 in the table:");
        String num2 = cr.nextLine();
        System.out.println("| row_1 |   | row_2 |    | sum |   | bigger_size |" );
        System.out.print("  "+num1+"      ");
        System.out.print("    "+num2+"      ");
        int Snum=Integer.parseInt(num1)+Integer.parseInt(num2);
        System.out.print("     "+Snum+"      ");
//        if (num1.length() > num2.length()){
//            System.out.print("     "+num1+"      ");
//        }else
//        {
//            System.out.print("  "+num2+"      ");
//        }
    }
}
