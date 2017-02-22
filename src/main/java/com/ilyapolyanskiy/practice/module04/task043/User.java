package com.ilyapolyanskiy.practice.module04.task043;

import com.ilyapolyanskiy.practice.module04.task041.ChinaBank;
import com.ilyapolyanskiy.practice.module04.task041.EUBank;
import com.ilyapolyanskiy.practice.module04.task041.USBank;
import com.ilyapolyanskiy.practice.module04.task042.SalaryCurrency;

/**
 * Created by ignipolari on 22.02.17.
 */
public class User {
    int withdrawal = 1000;
    USBank usBank = new USBank();
    EUBank euBank = new EUBank();
    ChinaBank chiBank = new ChinaBank();
    SalaryCurrency curr = new SalaryCurrency(SalaryCurrency.Currency.USD);

    public void valueSetter() {
        switch(curr.name){
            case USD:

                usBank.setLimitOfWithdrawal(1000);
                usBank.setMonthlyRate(1);

                if (withdrawal < 1000) {
                    usBank.setCommission(5);
                }
                else{
                    usBank.setCommission(7);
                }

                euBank.setLimitOfWithdrawal(2000);
                euBank.setMonthlyRate(0);
                euBank.setLimitOfFunding(10000);

                if (withdrawal < 1000) {
                    euBank.setCommission(5);
                }
                else{
                    euBank.setCommission(7);
                }

                chiBank.setLimitOfWithdrawal(100);
                chiBank.setMonthlyRate(1);
                chiBank.setLimitOfFunding(10000);

                if (withdrawal < 1000) {
                    chiBank.setCommission(3);
                }
                else{
                    chiBank.setCommission(5);
                }

            case EUR:

                usBank.setLimitOfFunding(10000);
                usBank.setLimitOfWithdrawal(1200);
                usBank.setMonthlyRate(2);

                if (withdrawal < 1000) {
                    usBank.setCommission(6);
                }
                else{
                    usBank.setCommission(8);
                }

                euBank.setLimitOfWithdrawal(2200);
                euBank.setMonthlyRate(1);
                euBank.setLimitOfFunding(20000);

                if (withdrawal < 1000) {
                    euBank.setCommission(2);
                }
                else{
                    euBank.setCommission(4);
                }

                chiBank.setLimitOfWithdrawal(150);
                chiBank.setMonthlyRate(0);
                chiBank.setLimitOfFunding(5000);

                if (withdrawal < 1000) {
                    chiBank.setCommission(10);
                }
                else{
                    chiBank.setCommission(11);
                }
        }
    }

}
