package com.test.architecture;

import java.util.ArrayList;
import java.util.Arrays;

public class Utils {
    public static ArrayList<UserModel> users;

    public Utils() {
        users = new ArrayList<>();
        users.add(new UserModel("someone1", "FlX1509001"));
        users.add(new UserModel("someone2", "FlX1509002"));
        users.add(new UserModel("someone3", "FlX1509003"));
    }

    public static ArrayList<UserModel> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<UserModel> users) {
        Utils.users = users;
    }
}
