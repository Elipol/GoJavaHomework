package com.ilyapolyanskiy.practice.module02.task022;

/**
 * Created by GVNcoder on 31.01.2017.
 */
public class TKRunner {
    public static void main(String[] args) {
        int balance = 100;
        int withdrawal = 10;
        TactionKeeper keeper = new TactionKeeper();
        if (keeper.balanceCalc(balance, withdrawal) > 0)
            System.out.println("OK " + keeper.commissionCalc(withdrawal) + " " + keeper.balanceCalc(balance, withdrawal));
        else
            System.out.println("NO");
    }
}
