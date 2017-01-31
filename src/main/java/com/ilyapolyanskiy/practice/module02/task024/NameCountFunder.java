package com.ilyapolyanskiy.practice.module02.task024;

import com.ilyapolyanskiy.practice.module02.task022.TactionKeeper;

/**
 * Created by GVNcoder on 31.01.2017.
 */
public class NameCountFunder {
    public static void main(String[] args) {

        double[] balances = {1200, 250, 2000, 500, 3200};

        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Oww";
        double withdrawal = 100;
        int index;
        TactionKeeper funder = new TactionKeeper();

        for (index = 0; index < ownerNames.length; index++)
            if (ownerNames[index] == ownerName)
                break;
        balances[index] = funder.balanceFund(balances[index],withdrawal);
        System.out.println(ownerName + " " + balances[index]);
    }
}