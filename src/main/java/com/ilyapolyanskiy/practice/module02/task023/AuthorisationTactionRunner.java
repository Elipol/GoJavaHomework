package com.ilyapolyanskiy.practice.module02.task023;

import com.ilyapolyanskiy.practice.module02.task022.TactionKeeper;

/**
 * Created by GVNcoder on 31.01.2017.
 */
public class AuthorisationTactionRunner {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName = "Ann";
        int withdrawal = 100;
        int index;

        for (index = 0; index < ownerNames.length; index++)
            if (ownerNames[index] == ownerName)
                break;

        TactionKeeper nameKeeper = new TactionKeeper();
        if (nameKeeper.balanceCalc(balances[index], withdrawal) > 0)
            System.out.println(ownerName + " " + withdrawal + " " + " " + nameKeeper.balanceCalc(balances[index], withdrawal));
        else
            System.out.println(ownerNames[index] + " NO");
    }
}
