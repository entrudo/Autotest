package com.company.Lessons_home_Work.Lesson4_Home_Work;

public class Task10 {
    public static void main(String[] args) {
        int[] arr = new int[128];
        for (int i=0; i<arr.length; i++){
            arr[i] = i;
        }

        char[] codes = IntCodes(arr);

        for (char code: codes){
            System.out.println(codes[code]);
        }
    }

        public static char[] IntCodes(int[] array){
        char[] codes = new char[array.length];

        for (int i = 0; i < array.length; i++){
            codes[i] = (char)array[i];
        }
        return codes;
    }
}
