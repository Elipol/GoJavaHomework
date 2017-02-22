package com.ilyapolyanskiy.practice.module04.trask042;

/**
 * Created by ignipolari on 22.02.17.
 */
public class SalaryCurrency {
    public enum Currency{
        USD,EUR;
    }
    Currency name;

    public SalaryCurrency(Currency name) {
        this.name = name;
    }

    public void paySalary(){
        switch(name){

            case EUR:
                System.out.println("you receive a salary in euros!!!");
            case USD:
                System.out.println("you receive a salary in US dollars!!!");
        }
    }

}
