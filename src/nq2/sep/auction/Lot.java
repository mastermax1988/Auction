package nq2.sep.auction;

class Lot {
  private Bid highestBid;
  private final String description;

  Lot(String description) {
    this.description = description;
  }

  Person getHighestBidder(){
    return highestBid.getPerson();
  }

  boolean placeBid(Bid bid) {
    if (highestBid == null) {
      // wenn noch kein Gebot vorliegt, dann ist das aktuelle Gebot das Höchste.
      highestBid = bid;
      return true;
    }
    //hightestBid existiert und ist nicht null
    if (highestBid.getAmount() >= bid.getAmount()) {
      return false;
    } else {
      highestBid = bid;
      return true;
    }
  }
}
