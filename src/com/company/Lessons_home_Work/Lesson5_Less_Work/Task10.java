package com.company.Lessons_home_Work.Lesson5_Less_Work;

/**
 * Created by Ent on 18.08.2016.
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(ifEven(15));
        char[] arr = {'c', 'b', 'd', '1'};
        int[] codes = charCodes(arr);
        for (int code: codes){
            System.out.println(code);
        }
//        System.out.println(charCodes());

    }

    public static boolean ifEven(int a){
        boolean result = (a%2==0)? true : false;

        return result;
    }
    public static int[] charCodes(char[] array){
        int[] codes = new int[array.length];

        for (int i = 0; i < array.length; i++){
            codes[i] = (int)array[i];
        }
        return codes;
    }
}
