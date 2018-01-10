import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {


    Player player;

    @Before
    public void before(){
        player = new Player("Marky");
    }

    @Test
    public void playerHasName(){
        assertEquals("Marky", player.getName());
    }

}



