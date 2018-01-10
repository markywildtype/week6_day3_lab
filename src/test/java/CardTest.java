import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CardTest {


    private Card card;


    @Before
    public void before(){
        card  = new Card(Suit.HEARTS, Rank.ACE);
    }

    @Test
    public void cardHasSuit(){
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    public  void cardHasRank(){
        assertEquals(Rank.ACE, card.getRank());
    }

}
