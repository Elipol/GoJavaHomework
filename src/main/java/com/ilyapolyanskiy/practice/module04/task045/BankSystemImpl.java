package com.ilyapolyanskiy.practice.module04.task045;

import com.ilyapolyanskiy.practice.module04.task044.*;

/**
 * Created by ignipolari on 22.02.17.
 */
public class BankSystemImpl implements BankSystem {

    public void withdrawOfUser(User user, int amount) {

        user.setBalance(user.getBalance() - amount);

        System.out.println("USER: " + user + "\n" + "your balance now: " + user.getBalance());
    }

    public void fundUser(User user, int amount) {

        user.setBalance(user.getBalance() + amount);

        System.out.println("USER: " + user + "\n" + "your balance now: " + user.getBalance());
    }

    public void transferMoney(User fromUser, User toUser, int amount) {

         toUser.setBalance(toUser.getBalance() + amount);
          fromUser.setBalance(fromUser.getBalance() - amount);

        System.out.println("sender: " + fromUser + "\n" + "recipient: " + toUser + "\n" + "transfer summ: " + amount);
    }

    public void paySalary(User user) {

        user.setBalance(user.getBalance() + user.getSalary());

        System.out.println(user + "\n" + "salary accrued!!!");
    }
}
