package com.ilyapolyanskiy.practice.module02.task022;

/**
 * Created by GVNcoder on 31.01.2017.
 */
public class TactionKeeper {
    private double commission, balanceAfter;
    private int withdrawal;
    public double commissionCalc(int withdrawal) {
        commission = (double) withdrawal * 0.05;
        return commission;
    }
    public double balanceCalc(int balance, int withdrawal) {
        balanceAfter = (double) balance - withdrawal * 0.05 - withdrawal;
        return balanceAfter;
    }
}
