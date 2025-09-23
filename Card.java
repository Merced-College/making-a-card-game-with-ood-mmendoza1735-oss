public class Card {
    //data variables
    private String cardSuit;

    private String cardName;

    private String cardPicture;

    private int cardValue;
    

    // set/get methods

    //Constructor
    public Card(String cardSuit, String cardName, int cardValue, String cardPicture) {
        this.cardSuit = cardSuit;
        this.cardName = cardName;
        this.cardValue = cardValue;
        this.cardPicture = cardPicture;
    }

    //toString method to read the cards
    public String toString() {
        return cardName + " of " + cardSuit + " (Value: " + cardValue + ", Picture: " + cardPicture + ")";
    }

    //equal method so that we can compare cards and say if they are the same
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Card card = (Card) obj;
        return cardName.equals(card.cardName);
    }

}