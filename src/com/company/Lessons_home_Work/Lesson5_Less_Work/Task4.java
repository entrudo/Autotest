package com.company.Lessons_home_Work.Lesson5_Less_Work;

/**
 * Created by Ent on 18.08.2016.
 */
public class Task4 {
    public static void main(String[] args) {
        for (int i=0; i<9; i++){
            for (int j=9; j>=i; j--){
                System.out.print(" ");
                continue;
            }
            for (int k = 0; k<i; k++){
                System.out.print("#");
            }


            System.out.println();
        }
    }
}
