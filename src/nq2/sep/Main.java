package nq2.sep;

import nq2.sep.auction.Auction;
import nq2.sep.auction.Person;

public class Main {

    public static void main(String[] args) {
	      Auction auction = new Auction();
        Person bidder1 = new Person("Alice");
        Person bidder2 = new Person("Bob");
        int lot1 = auction.addLot("Goldene Uhr");
        auction.placeBid(lot1, bidder1, 100);
        auction.placeBid(lot1, bidder2, 80);
        auction.placeBid(lot1, bidder2, 180);
    }
}
