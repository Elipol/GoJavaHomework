package com.ilyapolyanskiy.practice.module02.task022;

/**
 * Created by GVNcoder on 31.01.2017.
 */
public class TactionKeeper {
    public double commissionCalc(int withdrawal) {
        double commission = (double) withdrawal * 0.05;
        return commission;
    }
    public double balanceCalc(int balance, int withdrawal) {
        double balanceAfter = (double) balance - withdrawal * 0.05 - withdrawal;
        return balanceAfter;
    }
}
