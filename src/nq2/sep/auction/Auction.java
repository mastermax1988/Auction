package nq2.sep.auction;

import java.util.ArrayList;

public class Auction {

  private ArrayList<Lot> lotList;
  private int currentLotIndex;

  public Auction(){
    lotList = new ArrayList<>();
    currentLotIndex = -1;
  }

  public int addLot(String description){
    Lot lot = new Lot(description);
    lotList.add(lot);
    currentLotIndex++;
    System.out.println("Lot '" + description + "' mit lotNr " + currentLotIndex + " angelegt.");
    return currentLotIndex;
  }

  public void placeBid(int lotNr, Person person, int value) {
    if(lotNr < 0 || lotNr > currentLotIndex){
      System.out.println("Lot existiert nicht. Die lotNr muss zwischen 0 und " + currentLotIndex + " sein.");
      return; //verlasse die Methode
    }
    /* Kurzfassung
      if(lotList.get(lotNr).placeBid(new Bid(person, value)))
    */
    Bid bid = new Bid(person, value);
    Lot currentLot = lotList.get(lotNr);
    boolean bidSuccessful = currentLot.placeBid(bid);

    if(bidSuccessful){
      System.out.println("Gebot erfolgreich.");
    } else{
      System.out.println("Gebot zu niedrig.");
    }
  }
}
