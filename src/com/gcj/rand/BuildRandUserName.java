package com.gcj.rand;

import java.util.ArrayList;
import java.util.List;

public class BuildRandUserName {

    private String basic;

    private int numbers;

    public BuildRandUserName(String basic, int numbers) {
        this.basic = basic;
        this.numbers = numbers;
    }

    public List<String> buildUserName() {
        List<String> userNameList = new ArrayList<String>();
        for (int i = 1; i <= numbers; i++) {
            int index = i + 8000;
            String userName = basic + index;
            userNameList.add(userName);
            System.out.println("UserName: " + userName);
        }
        return userNameList;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
}
