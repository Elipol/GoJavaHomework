package com.ilyapolyanskiy.practice.module04.task046;

import com.ilyapolyanskiy.practice.module04.task041.Bank;
import com.ilyapolyanskiy.practice.module04.task041.USBank;
import com.ilyapolyanskiy.practice.module04.task045.BankSystemIpl;
import com.ilyapolyanskiy.practice.module04.task045.User;

/**
 * Created by ignipolari on 27.02.17.
 */
public class Main {
    public static void main(String[] args) {
        BankSystemIpl bs = new BankSystemIpl();
        Bank Capital = new USBank();
        Bank EIB = new USBank();
        Bank ADBC = new USBank();

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        User user5 = new User();
        User user6 = new User();

        user1.setBank(Capital);
        user2.setBank(Capital);
        user3.setBank(EIB);
        user4.setBank(EIB);
        user5.setBank(ADBC);
        user6.setBank(ADBC);

        bs.withdrawOfUser(user1, 200);
  //      System.out.println(user1 + "\n" + user2 + "\n" + user3 + "\n" + user4 + "\n" + user5 + "\n" + user6);




    }
}
