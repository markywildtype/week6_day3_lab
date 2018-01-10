import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(Suit.SPADES, Rank.ACE);
    }

    @Test
    public void deckStartsWithFiftyTwoCards(){
        assertEquals(52, deck.cardCount());
    }


    @Ignore//can't easily compare
    public void deckContainsCard(){
        deck.fillDeck();
        assertEquals(true, deck.getDeck().equals(card));
    }

}
