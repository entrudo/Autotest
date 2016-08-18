package com.company.Lesson2_home_Work.Lesson2_Home_Work;

import java.util.Scanner;

public class Conversions2 {
    public static void main(String[] args){
        Scanner cr = new Scanner(System.in);
        System.out.println("Please enter the meter");
        int Met = cr.nextInt();
        System.out.println("Please enter the inches");
        int Inc = cr.nextInt();
        System.out.println("Please enter the mile");
        int Mil = cr.nextInt();
        System.out.println("Please enter the kilometre");
        int Kil = cr.nextInt();
        System.out.println("Please enter the kilogram");
        int Kilo = cr.nextInt();
        System.out.println("Please enter the pound");
        int Po = cr.nextInt();
        System.out.println("Please enter the km/hr");
        int Kh = cr.nextInt();
        System.out.println("Please enter the mi/hr");
        int Mh = cr.nextInt();
        //Convert meters to inches
        System.out.println("Convert meters to inches");
        double Inc2 = (Met*100)/2.54;
        System.out.println(Inc2);
        System.out.println("Convert inches to meters");
        double Met2 = (Inc*2.54)/100;
        System.out.println(Met2);
        System.out.println("Convert miles to kilometres");
        double Mil2=Mil*1.60934d;
        System.out.println(Mil2);
        System.out.println("Convert kilometres to miles");
        double Kil2=Kil/1.60934d;
        System.out.println(Kil2);
        System.out.println("Convert pounds to kilograms");
        double Kilo2 = Po/2.20462d;
        System.out.println(Kilo2);
        System.out.println("Convert kilograms to pounds");
        double Po2=Kilo*2.20462d;
        System.out.println(Po2);
        System.out.println("Convert speed km/hr to mi/hr");
        double Kh2 = Kh/3.6d;
        System.out.println(Kh2);
        System.out.println("Convert speed mi/hr to km/hr");
        double Mh2=Kh*3.6d;
        System.out.println(Mh2);

    }
}
