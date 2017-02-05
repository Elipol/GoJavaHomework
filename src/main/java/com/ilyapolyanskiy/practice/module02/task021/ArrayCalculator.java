package com.ilyapolyanskiy.practice.module02.task021;
/**
 * Created by GVNcoder on 30.01.2017.
 */
public class ArrayCalculator{
    public void sum(int array[]){
        int iCount = 0;
        for (int i = 0; i < array.length; i++)
            iCount += array[i];
        System.out.println("\nСумма элементов массива: " + iCount);
    }
    public void sum(double array[]){
        double dCount = 0;
        for (int i = 0; i < array.length; i++)
            dCount += array[i];
        System.out.println("\nСумма элементов массива: " + dCount);
    }
    public void minDivMax(int array[]) {
        int iMin = 0, iMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (iMin >= array[i])
                iMin = array[i];
            else if(iMax <= array[i])
                iMax = array[i];
        }
        System.out.println("\nmin элемент: " +iMin + "\nmax элемент: " + iMax);
    }
    public void minDivMax(double array[]){
        double dMin = 0, dMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (dMin >= array[i])
                dMin = array[i];
            else if(dMax <= array[i])
                dMax = array[i];
        }
        System.out.println("\nmin элемент: " +dMin + "\nmax элемент: " + dMax);
    }
    public void maxPositive(int arr[]){
        int iMax = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > iMax)
                iMax = arr[i];
        System.out.println("\nНайбольший положительный элемент: " + iMax);
    }
    public void maxPositive(double array[]){
        double dMax = array[0];
        for (int i = 0; i < array.length; i++)
            if (array[i] > dMax)
                dMax = array[i];
        System.out.println("\nНайбольший положительный элемент: " + dMax);
    }
    public void multiplication(int array[]){
        int iMultiple = 1;
        for (int i = 0; i < array.length; i++)
                iMultiple *= array[i];
        System.out.println("\nПроизведение всех элементов: " + iMultiple);
    }
    public void multiplication(double array[]){
        double dMultiple = 1;
        for (int i = 0; i < array.length; i++)
            dMultiple *= array[i];
        System.out.println("\nПроизведение всех элементов: " + dMultiple);
    }
    public void modulus(int array[]){
        System.out.println("\nМодуль первого элемента: " + Math.abs(array[0]) + "\nМодуль последнего " + Math.abs(array[array.length - 1]));
    }
    public void modulus(double array[]){
        System.out.println("\nмодуль первого элемента: " + Math.abs(array[0]) + "; модуль последнего: " + Math.abs(array[array.length - 1]));
    }

    public void secondLargest(int array[]) {
        int iSecondMax = array[0], numer = 1;
        int iMax = array[0];
        for (int i = 0; i < array.length; i++)
                if (array[i] > iMax) {
                    iMax = array[i];
                }
        for (int i = 0; i < array.length; i++)
            if (iSecondMax < array[i] && array[i] != iMax) {
                iSecondMax = array[i];
                numer = i + 1;
            }
        System.out.println("\nВторой по величине элемент = " + iSecondMax + " №" + numer);
    }
    public void secondLargest(double array[]) {
        double dMax = array[0];
        double dSecondMax = array[0];
        int numer = 1;
        for (int i = 0; i < array.length; i++)
                if (array[i] > dMax) {
                    dMax = array[i];
                }
        for (int i = 0; i < array.length; i++)
            if (dSecondMax < array[i] && dSecondMax != dMax){
                dSecondMax = array[i];
                numer = i + 1;
            }
        System.out.println("\nВторой по величине элемент: " + dSecondMax + " №" + numer);
    }
}
