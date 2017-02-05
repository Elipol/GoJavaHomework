package com.ilyapolyanskiy.practice.module02.task021;

/**
 * Created by GVNcoder on 30.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        double[] mineDoubleArray = {-5.67,5.15,6.17,8.1,1.6,3.3,2.3,3.8,6.4,8.17};
        int[] mineArray  = {6,4,1,-7,-12,34,2,8,0,11};
        ArrayCalculator minArCalcul = new ArrayCalculator();
        System.out.println("====================================|");
        System.out.println("Результаты int массива");
        minArCalcul.sum(mineArray);
        minArCalcul.minDivMax(mineArray);
        minArCalcul.maxPositive(mineArray);
        minArCalcul.multiplication(mineArray);
        minArCalcul.modulus(mineArray);
        minArCalcul.secondLargest(mineArray);
        System.out.println("\n====================================|");
        System.out.println("Результаты double массива");
        minArCalcul.sum(mineDoubleArray);
        minArCalcul.minDivMax(mineDoubleArray);
        minArCalcul.maxPositive(mineDoubleArray);
        minArCalcul.multiplication(mineDoubleArray);
        minArCalcul.modulus(mineDoubleArray);
        minArCalcul.secondLargest(mineDoubleArray);
        System.out.println("\n====================================|");
    }
}
