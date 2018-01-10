import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck;

    public Deck(){
        deck = new ArrayList<>();
    }

    public int cardCount() {
        return this.deck.size();
    }

    public void fillDeck() {
        for (Suit suit: Suit.values()){
            for (Rank rank: Rank.values()){
                Card cardToAdd = new Card(suit, rank);
                deck.add(cardToAdd);
            }
        }
    }

    public ArrayList getDeck(){
        return this.deck;
    }
}
