import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;

    @Before
    public void before(){
        dealer = new Dealer();
    }

    @Test
    public void dealerHasDeck(){
        assertEquals(52, dealer.getDealerDeck().getDeck().size());
    }

    @Test//dealer shuffle uses random so difficult to test fully
    public void dealerShuffleReturnsFullDeck(){
        assertEquals(52, dealer.shuffle().size());
    }
}
