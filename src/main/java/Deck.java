import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<>();
        fillDeck();
        deckShuffle();
    }

    public int cardCount() {
        return this.cards.size();
    }

    public void fillDeck() {
        for (Suit suit: Suit.values()){
            for (Rank rank: Rank.values()){
                Card cardToAdd = new Card(suit, rank);
                cards.add(cardToAdd);
            }
        }
    }

    public void deckShuffle() {
        Collections.shuffle(cards);
    }

    public ArrayList<Card> getCards(){
        return this.cards;
    }

    public Card dealCard() {
        Card dealtCard = this.cards.remove(0);
        return dealtCard;
    }
}
