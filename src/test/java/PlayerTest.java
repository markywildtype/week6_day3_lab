import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {


    Player player;
    Card card;

    @Before
    public void before(){
        player = new Player("Marky");
        card = new Card(Suit.HEARTS, Rank.QUEEN);
    }

    @Test
    public void playerHasName(){
        assertEquals("Marky", player.getName());
    }

    @Test
    public void playerHasCard(){
        player.getCard(card);
        assertEquals(1, player.getHand().size());
    }

}



