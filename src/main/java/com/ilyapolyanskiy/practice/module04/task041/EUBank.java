package com.ilyapolyanskiy.practice.module04.task041;

import java.util.Currency;

/**
 * Created by ignipolari on 22.02.17.
 */
public class EUBank extends Bank{
private int limitOfWithdrawal, limitOfFunding, monthlyRate, commission;

    public EUBank(long totalCapital, long id, long rating, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee) {
        super(totalCapital, id, rating, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee);
    }

    public EUBank() {

    }

    public void setLimitOfWithdrawal(int limitOfWithdrawal) {
        this.limitOfWithdrawal = limitOfWithdrawal;
    }

    public void setLimitOfFunding(int limitOfFunding) {
        this.limitOfFunding = limitOfFunding;
    }

    public void setMonthlyRate(int monthlyRate) {
        this.monthlyRate = monthlyRate;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    int getLimitOfWithdrawal() {
        return limitOfWithdrawal;
    }

    int getLimitOfFunding() {
        return limitOfFunding;
    }

    int getMonthlyRate() {
        return monthlyRate;
    }

    int getCommission(int summ) {
        return commission;
    }
}
