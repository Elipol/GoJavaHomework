package com.ilyapolyanskiy.practice.module03.task034;

/**
 * Created by ignipolari on 10.02.17.
 */
public class Main {
    public static void main(String[] args) {
        User olegAlexev = new User(25700, 27, 2100, "Oleg", "Vodaphone","USD");

        olegAlexev.paySalary();
        olegAlexev.withdraw(1000);
        olegAlexev.monthIncreaser(6);

        System.out.println("\n" + olegAlexev.companyNameLength());
        System.out.println("current balance: " + olegAlexev.getBalance() + " " +olegAlexev.getCurrency() + "\ncurrent month of emp: " + olegAlexev.getMonthsOfEmployment());
    }
}