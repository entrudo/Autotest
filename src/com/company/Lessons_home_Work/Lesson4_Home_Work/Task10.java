package com.company.Lessons_home_Work.Lesson4_Home_Work;

public class Task10 {
    public static void main(String[] args) {
        byte[] array = new byte[128];
        for (int i=0; i<array.length; i++){
            array[i] = (byte) i;
        }
        int[] codes = byteCodes(array);

        for (int code: codes){
            System.out.println(array[code]);
        }
    }

    public static int[] byteCodes(byte[] array){
        int[] codes = new int[array.length];

        for (int i = 0; i < array.length; i++){
            codes[i] = (int)array[i];
        }
        return codes;
    }
}
