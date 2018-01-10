import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CardTest {


    private Card card;

    @Before
    public void before(){
        card  = new Card(Suit.HEARTS);
    }

    @Test
    public void cardHasSuit(){
        assertEquals(Suit.HEARTS, card.getSuit());
    }

}
