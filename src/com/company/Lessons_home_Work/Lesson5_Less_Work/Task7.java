package com.company.Lessons_home_Work.Lesson5_Less_Work;

/**
 * Created by Ent on 18.08.2016.
 */
public class Task7 {
    public static void main(String[] args) {
        for (int i=9; i>0; i--){
            for (int j=0; j<9; j++){
                if (i<=1 || i>8){
                    System.out.print(" #");
                }else {
                    if (j==i){
                        System.out.print("#");
                    }else {
                        System.out.print("  ");
                    }

                }
            }
            System.out.println();
        }
    }
}
