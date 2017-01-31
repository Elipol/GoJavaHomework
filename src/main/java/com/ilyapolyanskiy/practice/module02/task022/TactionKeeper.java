package com.ilyapolyanskiy.practice.module02.task022;

/**
 * Created by GVNcoder on 31.01.2017.
 */
public class TactionKeeper {
    public String tactionKeeper(int balance, int withdrawal){
        double commission, balanceAfter;
        commission = (double)withdrawal * 0.05;
        balanceAfter = (double)balance - commission - withdrawal;
        if (balanceAfter >= 0)
            return "OK " + commission + " " + balanceAfter;
        else
            return "NO";
    }
}
