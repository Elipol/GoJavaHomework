package com.ilyapolyanskiy.practice.module04.task041;

import com.ilyapolyanskiy.practice.module04.task042.SalaryCurrency;

import java.util.Currency;


public abstract class Bank {
    private  long totalCapital, id, rating;
    private String bankCountry;
    private SalaryCurrency.Currency currency;
    private int numberOfEmployees;
    private double avrSalaryOfEmployee;

    public Bank() {
    }

    public Bank(long totalCapital, long id, long rating, String bankCountry, SalaryCurrency.Currency currency, int numberOfEmployees, double avrSalaryOfEmployee) {
        this.totalCapital = totalCapital;
        this.id = id;
        this.rating = rating;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public SalaryCurrency.Currency getCurrency() {
        return currency;
    }

    public void setCurrency(SalaryCurrency.Currency currency) {
        this.currency = currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    abstract int getLimitOfWithdrawal();

    abstract int getLimitOfFunding();

    abstract int getMonthlyRate();

    abstract int getCommission(int summ);

    double moneyPaidMonthlyForSalary(){
        return avrSalaryOfEmployee * numberOfEmployees;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "totalCapital=" + totalCapital +
                ", id=" + id +
                ", rating=" + rating +
                ", bankCountry='" + bankCountry + '\'' +
                ", currency=" + currency +
                ", numberOfEmployees=" + numberOfEmployees +
                ", avrSalaryOfEmployee=" + avrSalaryOfEmployee +
                '}';
    }
}