package com.ilyapolyanskiy.practice.module04.task045;

import com.ilyapolyanskiy.practice.module04.task044.User;

/**
 * Created by ignipolari on 22.02.17.
 */
public interface BankSystem {

    void withdrawOfUser(User user, int amount);
    void fundUser(User user, int amount);
    void transferMoney(User fromUser, User toUser, int amount);
    void paySalary(User user);
}
