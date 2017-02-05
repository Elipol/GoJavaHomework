package com.ilyapolyanskiy.practice.module02.task021;

/**
 * Created by GVNcoder on 30.01.2017.
 */
public class ArrayCalculator{
    private int iMin, iMax, iCount = 0, iMultiple = 1;
    private double dMin, dMax, dCount = 0, dMultiple = 1;

    public ArrayCalculator(int array[]){
        iMin = array[0];
        iMax = array[0];
        for (int i = 0; i < array.length; i++){
            iCount += array[i];
            if (iMin > array[i])
                iMin = array[i];
            else if (iMax < array[i])
                iMax = array[i];
            iMultiple *= array[i];
        }
    }
    public ArrayCalculator(double array[]){
        dMin = array[0];
        dMax = array[0];
        for (int i = 0; i < array.length; i++){
            dCount += array[i];
            if (dMin > array[i])
                dMin = array[i];
            else if (dMax < array[i])
                dMax = array[i];
            dMultiple *= array[i];
        }
    }
    public void sum(int array[]){
        System.out.println("\nСумма элементов массива: " + iCount);
    }
    public void sum(double array[]){
        System.out.println( "\nСумма элементов массива: " + dCount);
    }
    public void minDivMax(int array[]) {
        System.out.println("\nДеление min элемента на max: " + (double)iMin / iMax);
    }
    public void minDivMax(double array[]){
        System.out.println( "\nДеление min элемента на max: " +  dMin / dMax);
    }
    public void maxPositive(int arr[]){
        System.out.println("\nНайбольший положительный элемент: " + iMax);
    }
    public void maxPositive(double array[]){
        System.out.println("\nНайбольший положительный элемент: " + dMax);
    }
    public void multiplication(int array[]){
        System.out.println("\nПроизведение всех элементов: " + iMultiple);
    }
    public void multiplication(double array[]){
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
        for (int i = 0; i < array.length; i++)
            if (iSecondMax < array[i] && array[i] != iMax) {
                iSecondMax = array[i];
                numer = i + 1;
            }
        System.out.println("\nВторой по величине элемент = " + iSecondMax + " №" + numer);
    }
    public void secondLargest(double array[]) {
        double dSecondMax = array[0];
        int numer = 1;
        for (int i = 0; i < array.length; i++)
            if (dSecondMax < array[i] && dSecondMax != iMax){
                dSecondMax = array[i];
                numer = i + 1;
            }
        System.out.println("\nВторой по величине элемент: " + dSecondMax + " №" + numer);
    }
}
