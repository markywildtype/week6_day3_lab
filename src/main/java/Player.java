import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void getCard(Card card) {
        this.hand.add(card);
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
}
