package com.ilyapolyanskiy.practice.module03.task032;

/**
 * Created by ignipolari on 10.02.17.
 */
public class Main {
    public static void main(String[] args) {
        Arithmetic  theArithmet = new Arithmetic();
        Adder theAdder = new Adder();

        System.out.println(theArithmet.add(15, 18));
        System.out.println(theAdder.check(15, 18));
    }
}
