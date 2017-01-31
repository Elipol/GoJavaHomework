package com.ilyapolyanskiy.practice.module02.task021;

/**
 * Created by GVNcoder on 30.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        int[] mineArray = {5,5,6,8,1,3,2,3,6,8};
        ArrayCalculator minArCalcul = new ArrayCalculator(mineArray);
        System.out.println("====================================|");
        System.out.println(minArCalcul.sum(mineArray) + minArCalcul.minDivMax(mineArray) +
                minArCalcul.maxPositive(mineArray) + minArCalcul.multiplication(mineArray) +
                minArCalcul.modulus(mineArray) + minArCalcul.secondLargest(mineArray));
        System.out.println("\n====================================|");
    }
}
