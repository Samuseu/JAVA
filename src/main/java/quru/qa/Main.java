package quru.qa;

import quru.qa.data.Card;
import quru.qa.data.Country;
import quru.qa.data.UnionPayCard;
import quru.qa.data.VisaCard;

import java.util.ArrayList;
import java.util.List;

import static quru.qa.data.Country.RU;

public class Main {
    public static void main(String[] args) {
        invoke(new UnionPayCard());
    }

    public static void invoke(Card card) {
        card.setBalance(100);
        card.payInCountry(RU, 75);
        System.out.println(card.getBalance());
    }
    List<String> aList = new ArrayList<>();
}
