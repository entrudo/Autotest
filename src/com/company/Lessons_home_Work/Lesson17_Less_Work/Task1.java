package com.company.Lessons_home_Work.Lesson17_Less_Work;

public class Task1 extends UserData {
    public static void main(String[] args) throws Exception {

        UserDataFeature();
            for (User s : list) {
                try {
                    if (s.getPassword().contains("123123")) {
                        System.out.println(s.toString());
                    } else {
                        throw new NoUserExist("My new Exception!!!");
                    }
                }catch (NoUserExist ex){
                    System.out.println("We have error: " + ex.getMessage());
                }

            }
    }
}
