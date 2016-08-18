package com.company.Lessons_home_Work.Lesson5_Home_Work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ent on 18.08.2016.
 */
public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("dec to bin");
        System.out.println(BinToDec(br.readLine()));

        System.out.println("bin to dec");
        System.out.println(DecToBin(Integer.parseInt(br.readLine())));

        System.out.println("dec to hex");
        System.out.println(DecToHex(Integer.parseInt(br.readLine())));

        System.out.println("hex to dec");
        System.out.println(HexToDec(br.readLine()));
    }

    public static int BinToDec(String BinInt){
        int dec = Integer.parseInt(BinInt, 2);
        return dec;

    }

    public static String DecToBin(int number){
        String binary = Integer.toBinaryString(number);
        return binary;
    }

    public static String DecToHex(int number){
        String Hex = Integer.toHexString(number);
        return Hex;
    }

    public static int HexToDec(String number){
        int dec = Integer.parseInt(number, 16);
        return dec;
    }
}
