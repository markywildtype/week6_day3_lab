import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck;

    public Deck(){
        deck = new ArrayList<>();
    }

    public int cardCount() {
        return this.deck.size();
    }
}
