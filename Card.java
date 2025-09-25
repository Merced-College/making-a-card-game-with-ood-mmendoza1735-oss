public class Card {
    //data variables
    private String cardSuit;

    private String cardName;

    private String cardPicture;

    private int cardValue;
    

    // set/get methods

    public String getCardSuit() {
    return cardSuit;
}

    public void setCardSuit(String cardSuit) {
        this.cardSuit = cardSuit;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardPicture() {
        return cardPicture;
    }

    public void setCardPicture(String cardPicture) {
        this.cardPicture = cardPicture;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

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