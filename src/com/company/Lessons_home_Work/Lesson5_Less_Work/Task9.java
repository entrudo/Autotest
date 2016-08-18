package com.company.Lessons_home_Work.Lesson5_Less_Work;

/**
 * Created by Ent on 18.08.2016.
 */
public class Task9 {
    public static void main(String[] args) {
        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){

                if (i==0 || i==8){
                    System.out.print("# ");
                    continue;
                }
                if (j==i || j== 8-i || j==0 || j==8){
                    System.out.print("# ");
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
