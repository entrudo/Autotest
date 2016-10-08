package com.company.Lessons_home_Work.Lesson17_Less_Work;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class UserData {
    static ArrayList<User> list = new ArrayList<User>();

    public static void UserDataFeature() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("User.txt"));
        String data = "";

        while ((data = reader.readLine()) != null) {
            User user = new User();
            String[] dataUser = data.split(",");
            user.setName(dataUser[0]);
            user.setEmail(dataUser[1]);
            user.setPassword(dataUser[2]);
            list.add(user);
        }
    }

    static class NoUserExist extends Exception {
        public NoUserExist(String message) {
            super(message);
        }
    }
}
