package com.ilyapolyanskiy.practice.module04.task044;

import com.ilyapolyanskiy.practice.module04.task041.Bank;

/**
 * Created by ignipolari on 22.02.17.
 */
public class User {
    private long id;
    private String name, companyName;
    private double balance;
    private int monthsOfEmployment, salary;
    public Bank bank;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", balance=" + balance +
                ", monthsOfEmployment=" + monthsOfEmployment +
                ", salary=" + salary +
                ", bank=" + bank +
                '}';
    }
}
