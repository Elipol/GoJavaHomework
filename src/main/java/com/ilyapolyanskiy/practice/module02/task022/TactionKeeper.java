package com.ilyapolyanskiy.practice.module02.task022;

/**
 * Created by GVNcoder on 31.01.2017.
 */
public class TactionKeeper {
    public double commissionCalc(double withdrawal) {
        double commission = (double) withdrawal * 0.05;
        return commission;
    }
    public double balanceCalc(double balance, double withdrawal) {
        double balanceAfter = (double) balance - withdrawal * 0.05 - withdrawal;
        return balanceAfter;
    }
    public double balanceFund(double balance, double withdrawal){
        double balanceAfter = balance + withdrawal;
        return balanceAfter;
    }
}
