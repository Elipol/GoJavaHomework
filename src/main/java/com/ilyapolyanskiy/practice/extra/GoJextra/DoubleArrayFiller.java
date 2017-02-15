package com.ilyapolyanskiy.practice.extra.GoJextra;

import java.util.Arrays;

/**
 * Created by ignipolari on 15.02.17.
 */
public class DoubleArrayFiller {
    public static void main(String[] args) {
        DoubleArrayFiller doubleArray = new DoubleArrayFiller();
        int[][] testArray = doubleArray.getFilledArray(3, 3);

        for (int i = 0; i < testArray.length; i++) {
            System.out.println(Arrays.toString(testArray[i]));
        }
    }

    public int[][] getFilledArray(int x, int y) {
        int[][] mArray = new int[y][x];

        for (int i = 0, k = 1; i < y; i++)
            for (int j = 0; j < x; j++){
                mArray[i][j] = k;
                k++;
            }

        return mArray;

    }
}