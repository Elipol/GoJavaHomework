package com.ilyapolyanskiy.practice.module02.task022;

/**
 * Created by GVNcoder on 31.01.2017.
 */
public class TKRunner {
    public static void main(String[] args) {
        double balance = 100.0;
        double withdrawal = 10.0;
        TactionKeeper keeper = new TactionKeeper();
        if (keeper.balanceCalc(balance, withdrawal) > 0)
            System.out.println("OK " + keeper.commissionCalc(withdrawal) + " " + keeper.balanceCalc(balance, withdrawal));
        else
            System.out.println("NO");
    }
}
