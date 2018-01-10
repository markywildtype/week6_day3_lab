import org.junit.Before;
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
//        assertEquals(52, dealer.getDealerDeck().getCards().size());
        assertEquals(52, dealer.getDeckSize());
    }

//    @Test
//    public void dealerCanDealCard(){
//        dealer.deal();
//        assertEquals(51, dealer.getDealerDeck().getCards().size());
//    }
}

 //TODO refactor the dealer deck size into one method!