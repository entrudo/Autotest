package com.company.Lessons_home_Work.Lesson6_Home_Work;

//        6. Product code validation eg: AX6BYU56UX6CV6BNT7NM 287430
//        1st part can contain only capital letters and 6 digits. 2nd part is all digits and = the product of the
//        first 6 digits taken in groups of two from the left. Eg 65*66*67 = 287430.

public class Task6 {
    public static void main(String[] args){
        System.out.println("Your product code validation is");
        System.out.println(randomString());
    }

    public static String randomString() {
        String newString = "";
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str2 = "0123456789";
        String sTemp1 = "";
        String sTemp2 = "";
        String sTemp3 = "";
        String sTemp4 = "";
        String sTemp5 = "";
        String sTemp6 = "";
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        for (int i = 0; i < 2; i++) {
            newString += str.charAt((int) (Math.random() * str.length() + 0));
        }

        for (int i = 0; i < 1; i++) {
            sTemp1 += str2.charAt((int) (Math.random() * str2.length() + 0));
            newString += sTemp1;
        }
        for (int i = 0; i < 3; i++) {
            newString += str.charAt((int) (Math.random() * str.length() + 0));
        }
        for (int i = 0; i < 1; i++) {
            sTemp2 += str2.charAt((int) (Math.random() * str2.length() + 0));
            newString += sTemp2;
        }
        for (int i = 0; i < 1; i++) {
            sTemp3 += str2.charAt((int) (Math.random() * str2.length() + 0));
            newString += sTemp3;
        }
        for (int i = 0; i < 2; i++) {
            newString += str.charAt((int) (Math.random() * str.length() + 0));
        }
        for (int i = 0; i < 1; i++) {
            sTemp4 += str2.charAt((int) (Math.random() * str2.length() + 0));
            newString += sTemp4;
        }
        for (int i = 0; i < 2; i++) {
            newString += str.charAt((int) (Math.random() * str.length() + 0));
        }
        for (int i = 0; i < 1; i++) {
            sTemp5 += str2.charAt((int) (Math.random() * str2.length() + 0));
            newString += sTemp5;
        }
        for (int i = 0; i < 3; i++) {
            newString += str.charAt((int) (Math.random() * str.length() + 0));
        }
        for (int i = 0; i < 1; i++) {
            sTemp6 += str2.charAt((int) (Math.random() * str2.length() + 0));
            newString += sTemp6;
        }
        for (int i = 0; i < 2; i++) {
            newString += str.charAt((int) (Math.random() * str.length() + 0));
        }
        sTemp1 += sTemp2;
        sTemp3 += sTemp4;
        sTemp5 += sTemp6;
        temp1 = Integer.parseInt(sTemp1);
        temp2 = Integer.parseInt(sTemp3);
        temp3 = Integer.parseInt(sTemp5);
        int temp4 = temp1 * temp2 * temp3;

        newString += " " + Integer.toString(temp4);

        return newString;
    }

}
