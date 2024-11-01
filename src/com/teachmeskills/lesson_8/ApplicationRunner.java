package com.teachmeskills.lesson_8;

import com.teachmeskills.lesson_8.document_parser.IParser;
import com.teachmeskills.lesson_8.fabric.ParserFabric;
import com.teachmeskills.lesson_8.model.account.Account;
import com.teachmeskills.lesson_8.model.card.MasterCard;
import com.teachmeskills.lesson_8.model.card.VisaCard;
import com.teachmeskills.lesson_8.model.client.BaseClient;
import com.teachmeskills.lesson_8.model.client.IndividualClient;
import com.teachmeskills.lesson_8.model.client.LegalClient;
import com.teachmeskills.lesson_8.model.document.Check;
import com.teachmeskills.lesson_8.transfer.CardTransferService;
import com.teachmeskills.lesson_8.transfer.impl.MasterCardTransferService;
import com.teachmeskills.lesson_8.transfer.impl.VisaCardTransferService;

import java.util.Date;
import java.util.Scanner;

public class ApplicationRunner {

    public static void main(String[] args) {

        // TODO запросить с консоли путь и имя файла +

        Scanner sc = new Scanner(System.in);
        System.out.print("Specify the path to the file: ");
        String path = sc.nextLine();

        // TODO реализовать тестовый сценарий +
        // создать двух клиентов

        LegalClient client1 = new LegalClient();
        IndividualClient client2 = new IndividualClient();

        // каждому клиенту создать два счета и две карты

        Account account1 = new Account("219301", 800);
        Account account2 = new Account("839138", 600);

        VisaCard clientCard1 = new VisaCard("317387",987,new Date(),"Andrey","USD",60);
        MasterCard clientCard2 = new MasterCard("893483",675,new Date(),"Nikita","EUR",34);

        // перевести с карты одного клиента на карту другого сумму денег
        // перевести с карты одного клиента на счет другого клиента сумму денег

        CardTransferService transferServiceFor1Client = new VisaCardTransferService();
        CardTransferService transferServiceFor2Client = new MasterCardTransferService();

        Check resultForTransferFromCardToCard = transferServiceFor1Client.transferFromCardToCard(clientCard1,clientCard2,78);
        Check resultForTransferFromCardToAccount = transferServiceFor2Client.transferFromCardToAccount(clientCard2,account1,60);

        resultForTransferFromCardToCard.showCheckInfo();
        resultForTransferFromCardToAccount.showCheckInfo();
    }
}
