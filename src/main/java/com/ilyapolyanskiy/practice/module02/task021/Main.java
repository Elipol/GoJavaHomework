package com.ilyapolyanskiy.practice.module02.task021;

/**
 * Created by GVNcoder on 30.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        double[] mineArray = {-5.67,5.15,6.17,8.1,1.6,3.3,2.3,3.8,6.4,8.17};
        ArrayCalculator minArCalcul = new ArrayCalculator(mineArray);
        System.out.println("====================================|");
        System.out.println(minArCalcul.sum(mineArray) + minArCalcul.minDivMax(mineArray) +
                minArCalcul.maxPositive(mineArray) + minArCalcul.multiplication(mineArray) +
                minArCalcul.modulus(mineArray) + minArCalcul.secondLargest(mineArray));
        System.out.println("\n====================================|");
    }
}
