package com.ilyapolyanskiy.practice.module03.task031;

import com.ilyapolyanskiy.practice.module03.task031.Bird;

/**
 * Created by ignipolari on 10.02.17.
 */
public class Runner {
    public static void main(String[] args) {
        Bird theBird = new Bird();
        theBird.walking();
        theBird.fly();
        theBird.sing();
        theBird.selfRecognize();
    }
}
