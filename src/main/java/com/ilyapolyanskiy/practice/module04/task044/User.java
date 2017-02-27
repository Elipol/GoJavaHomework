package com.ilyapolyanskiy.practice.module04.task044;

import com.ilyapolyanskiy.practice.module04.task041.Bank;

/**
 * Created by ignipolari on 22.02.17.
 */
public class User {
    protected long id;
    protected String name, companyName;
    protected double balance;
    protected int monthsOfEmployment, salary;
    protected Bank bank;

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