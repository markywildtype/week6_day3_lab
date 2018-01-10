public class WinChecker {

    private Player player1;
    private Player player2;

    public WinChecker(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public int getHandValue(Player player){
        return player.getHand().get(0).getRank().getValue();
    }

    public boolean hasWon() {
        int p1HandVal = getHandValue(player1);
        int p2HandVal = getHandValue(player2);
        if(p1HandVal > p2HandVal){
            return true;
        } else {
        return false;
        }
    }


//        int player1Hand = player1.getHand().get(0).getRank().getValue();
//        int player2Hand = player2.getHand().get(0).getRank().getValue();
//        if(player1Hand > player2Hand){
//            return true;
//        } else {
//            return false;
//        }
//    }
}
