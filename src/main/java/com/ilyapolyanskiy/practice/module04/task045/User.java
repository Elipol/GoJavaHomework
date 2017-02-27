package com.ilyapolyanskiy.practice.module04.task045;

import com.ilyapolyanskiy.practice.module04.task041.Bank;

/**
 * Created by ignipolari on 27.02.17.
 */
public class User extends com.ilyapolyanskiy.practice.module04.task044.User{

    public long getId() {
        return super.id = id;
    }

    public void setId(long id) {
        super.id = id;
    }

    public String getName() {
        return super.name;
    }

    public void setName(String name) {
        super.name = name;
    }


    public String getCompanyName() {
        return super.companyName;
    }

    public void setCompanyName(String companyName) {
        super.companyName = companyName;
    }


    public double getBalance() {
        return super.balance;
    }

    public void setBalance(double balance) {
        super.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return super.monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        super.monthsOfEmployment = monthsOfEmployment;
    }

    public int getSalary() {
        return super.salary;
    }

    public void setSalary(int salary) {
        super.salary = salary;
    }

    public Bank getBank() {
        return super.bank;
    }


    public void setBank(Bank bank) {
        super.bank = bank;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
