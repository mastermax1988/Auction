package nq2.sep.auction;

class Bid {

  private final Person person;
  private final int amount;

  Bid(Person person, int amount){
    this.person = person;
    this.amount = amount;
  }

  int getAmount() {
    return amount;
  }

  Person getPerson() {
    return person;
  }
}
