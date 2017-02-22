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
        User userUS1 = new User();
        User userUS2 = new User();
        User userUS3 = new User();
        User userUS4 = new User();
        User userUS5 = new User();
        User userUS6 = new User();

        userUS1.bank = new USBank();
        userUS2.bank = new USBank();

        userUS3.bank = new EUBank();
        userUS4.bank = new EUBank();

        userUS5.bank = new ChinaBank();
        userUS6.bank = new ChinaBank();
        
    }

}
