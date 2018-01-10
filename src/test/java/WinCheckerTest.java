import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WinCheckerTest {

    WinChecker winChecker;
    Card card1;
    Card card2;
    Player player1;
    Player player2;

    @Before
    public void before(){
        card1 = new Card(Suit.SPADES, Rank.ACE);
        card2 = new Card(Suit.SPADES, Rank.EIGHT);
        player1 = new Player("Marky");
        player2 = new Player("Graeme");
        player1.getCard(card1);
        player2.getCard(card2);
        winChecker = new WinChecker(player1, player2);
    }

    @Test
    public void canGetHandValue(){
        int actual = winChecker.getHandValue(player1);
        int actual2 = winChecker.getHandValue(player2);
        assertEquals(14, actual);
        assertEquals(8, actual2);
    }


    @Test
    public void playerWins(){
        assertEquals(true, winChecker.hasWon());
    }
}
