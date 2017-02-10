package com.ilyapolyanskiy.practice.module03.task034;

/**
 * Created by ignipolari on 10.02.17.
 */
public class User {
    private int balance, monthsOfEmployment, salary;
    private String name, companyName, currency;

    public User(int balance, int monthsOfEmployment, int salary, String name, String companyName, String currency) {
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.salary = salary;
        this.name = name;
        this.companyName = companyName;
        this.currency = currency;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void paySalary(){
        balance += salary;
    }

    public void withdraw(int summ){
        double commission = (double)summ * 0.05;

        if (balance - (commission + summ) > 0 && summ < 1000)
            balance -= (commission + summ);

        else if (balance - (commission * 2 + summ) > 0)
            balance -= (commission * 2 + summ);
        else
            System.out.println("not enough money");
    }

    public int companyNameLength(){
        return companyName.length();
    }

    public void monthIncreaser(int addMonth){
        monthsOfEmployment += addMonth;
    }
}
