package com.teachmeskills.lesson_8.fabric;

import com.teachmeskills.lesson_8.document_parser.IParser;
import com.teachmeskills.lesson_8.document_parser.impl.PdfDocumentParser;
import com.teachmeskills.lesson_8.document_parser.impl.TxtDocumentParser;
import com.teachmeskills.lesson_8.model.card.BaseCard;
import com.teachmeskills.lesson_8.model.card.MasterCard;
import com.teachmeskills.lesson_8.model.card.VisaCard;

import java.util.Date;

public class CardFabric {

    public BaseCard createCardByCode(int cardCode){
        if(cardCode == 1){
            return new VisaCard("123456", 444, new Date(), "Andrew", "usd", 1);
        } else {
            return new MasterCard("234-566", 555, new Date(), "Marina", "usd", 82);
        }
    }
}
