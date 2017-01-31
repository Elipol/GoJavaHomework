package com.ilyapolyanskiy.practice.module02.task022;

/**
 * Created by GVNcoder on 31.01.2017.
 */
public class TKRunner {
    public static void main(String[] args) {
        int balance = 100;
        int withdrawal = 95;
        TactionKeeper keeper = new TactionKeeper();
        System.out.println(keeper.tactionKeeper(balance, withdrawal));
    }
}
