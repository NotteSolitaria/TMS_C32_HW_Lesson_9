package com.teachmeskills.lesson_8.transfer.impl;

import com.teachmeskills.lesson_8.model.account.Account;
import com.teachmeskills.lesson_8.model.card.BaseCard;
import com.teachmeskills.lesson_8.model.document.Check;
import com.teachmeskills.lesson_8.transfer.CardTransferService;
import com.teachmeskills.lesson_8.utils.Constants;

import java.util.Date;

// TODO реализовать имплементацию интерфейса +
public class MasterCardTransferService implements CardTransferService {

    @Override
    public Check transferFromCardToCard(BaseCard cardFrom, BaseCard cardTo, double transferAmount) {
        if (cardFrom.checkCardLimitTransfer(transferAmount)) {
            cardFrom.amount -= transferAmount;
            cardTo.amount += transferAmount;
            return new Check(transferAmount, new Date(), cardFrom.cardNumber, cardTo.cardNumber, "Success");
        } else {
            return new Check(transferAmount, new Date(), cardFrom.cardNumber, cardTo.cardNumber, "Limits were exceeded. Transfer limit for this card = " + Constants.MASTER_CARD_LIMIT);
        }
    }

    @Override
    public Check transferFromCardToAccount(BaseCard cardFrom, Account accountTo, double transferAmount) {
        if (cardFrom.checkCardLimitTransfer(transferAmount)) {
            cardFrom.amount -= transferAmount;
            accountTo.amount += transferAmount;
            return new Check(transferAmount, new Date(), cardFrom.cardNumber, accountTo.getNumber(), "Success");
        } else {
            return new Check(transferAmount, new Date(), cardFrom.cardNumber, accountTo.getNumber(), "Limits were exceeded. Transfer limit for this card = " + Constants.MASTER_CARD_LIMIT);
        }
    }
}
