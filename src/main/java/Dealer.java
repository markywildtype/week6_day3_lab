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


    public ArrayList<Card> shuffle() {
        ArrayList<Card> shuffleDeck = deck.getDeck();
        Collections.shuffle(shuffleDeck);
        return shuffleDeck;
    }
}
