package com.teachmeskills.lesson_8.model.client;

import com.teachmeskills.lesson_8.model.account.Account;
import com.teachmeskills.lesson_8.model.card.BaseCard;

public abstract class BaseClient {

    static long counter = 0;

    public long id;
    String name;
    Account[] accounts;
    BaseCard[] cards;

    public BaseClient() {
        id++;
    }

    public static long getCounter() {
        return counter;
    }

    public static void setCounter(long counter) {
        BaseClient.counter = counter;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public BaseCard[] getCards() {
        return cards;
    }

    public void setCards(BaseCard[] cards) {
        this.cards = cards;
    }
}
