package com.company.Lessons_home_Work.Lesson3_Home_Work;


import java.util.Scanner;

public class Home_Work4 {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int i = cr.nextInt();
        if (i==1){
            System.out.println("Monday");
        }else if (i==2){
            System.out.println("Tuesday");
        }else if (i==3){
            System.out.println("Wednesday");
        }else if (i==4){
            System.out.println("Thursday");
        }else if (i==5){
            System.out.println("Friday");
        }else if (i==6){
            System.out.println("Saturday");
        }else if (i==7){
            System.out.println("Sunday");
        }else {
            System.out.println("Not a valid day");
        }

        switch (i){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: System.out.println("Not a valid day");
        }
    }
}
