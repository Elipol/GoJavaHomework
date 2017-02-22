package com.ilyapolyanskiy.practice.module04.task041;

import java.util.Currency;

/**
 * Created by ignipolari on 21.02.17.
 */
public class USBank extends Bank {
   private int limitOfWithdrawal, limitOfFunding, monthlyRate, commission;

    public USBank(long totalCapital, long id, long rating, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee) {
        super(totalCapital, id, rating, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee);
    }

    int getLimitOfWithdrawal() {
        return limitOfWithdrawal;
    }

    int getLimitOfFunding() {
        return limitOfFunding;
    }

    int getMonthlyRate() {return monthlyRate;}

    int getCommission(int summ) {
        return commission;
    }
}
