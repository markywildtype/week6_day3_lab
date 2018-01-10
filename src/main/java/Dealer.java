import java.util.ArrayList;
import java.util.Collections;

public class Dealer {

    private Deck deck;

    public Dealer(){
        deck = new Deck();
    }


    public Deck getDealerDeck() {
        return deck;
    }

    public int getDeckSize(){
        return this.deck.cardCount();
    }

    public Card deal(){
        Card card = this.deck.dealCard();
        return card;
    }


    //TODO create deal method
}
