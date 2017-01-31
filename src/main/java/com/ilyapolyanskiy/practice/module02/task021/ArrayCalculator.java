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
    public String sum(int array[]){
        return "\nСумма элементов массива: " + iCount;
    }
    public String sum(double array[]){
        return "\nСумма элементов массива: " + dCount;
    }
    public String minDivMax(int array[]) {
        return "\nДеление min элемента на max: " + (double)iMin / iMax;
    }
    public String minDivMax(double array[]){
        return "\nДеление min элемента на max: " +  dMin / dMax;
    }
    public String maxPositive(int arr[]){
        return "\nНайбольший положительный элемент: " + iMax;
    }
    public String maxPositive(double array[]){
        return "\nНайбольший положительный элемент: " + dMax;
    }
    public String multiplication(int array[]){
        return "\nПроизведение всех элементов: " + iMultiple;
    }
    public String multiplication(double array[]){
        return"\nПроизведение всех элементов: " + dMultiple;
    }
    public String modulus(int array[]){
        return "\nМодуль первого элемента: " + Math.abs(array[0]) + "\nМодуль последнего " + Math.abs(array[array.length - 1]);
    }
   // public String modulus(double array[]){
     //   double last = array[array.length];
       // return"\nмодуль первого элемента: " + Math.abs(array[0]) + "; модуль последнего: " + Math.abs(last);
    //}

    public String secondLargest(int array[]) {
        int iSecondMax = array[0];
        for (int i = 0; i < array.length; i++)
            if (iSecondMax < array[i] && array[i] != iMax)
                iSecondMax = array[i];
        return "\nВторой по величине элемент: " + iSecondMax;
    }
    public String secondLargest(double array[]) {
        double dSecondMax = array[0];
        for (int i = 0; i < array.length; i++)
            if (dSecondMax < array[i] && dSecondMax != iMax)
                dSecondMax = array[i];
        return "\nВторой по величине элемент: " + dSecondMax;
    }
}
