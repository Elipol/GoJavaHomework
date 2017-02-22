package com.ilyapolyanskiy.practice.module04.task045;

import com.ilyapolyanskiy.practice.module04.task041.ChinaBank;
import com.ilyapolyanskiy.practice.module04.task041.EUBank;
import com.ilyapolyanskiy.practice.module04.task041.USBank;
import com.ilyapolyanskiy.practice.module04.task044.User;

/**
 * Created by ignipolari on 22.02.17.
 */
public class Main {
    public static void main(String[] args) {
        int userAmount = 6;
        User users[] = new User[userAmount];

        users[0].bank = new USBank();
        users[1].bank = new USBank();

        users[2].bank = new EUBank();
        users[3].bank = new EUBank();

        users[4].bank = new ChinaBank();
        users[5].bank = new ChinaBank();

        for(int i = 0; i < userAmount; i++)
            System.out.println(users[i]);
    }

}
