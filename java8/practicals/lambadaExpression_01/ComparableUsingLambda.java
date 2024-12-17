import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableUsingLambda {
    public static void main(String[] args) {
        List<Player> playerss=new ArrayList<>(); 

        playerss.add(new Player("A-player", 770));
        playerss.add(new Player("D-player", 670));
        playerss.add(new Player("C-player", 960));
        playerss.add(new Player("E-player", 900));
        playerss.add(new Player("B-player", 300));
        playerss.forEach(System.out::println);

        System.out.println("========================");
    // Collections.sort(playerss,(p1,p2)->p2.playername.compareTo(p1.playername));
    playerss.sort((p1,p2)->p2.playername.compareTo(p1.playername));
    playerss.forEach(System.out::println);

    }
}
class Player implements Comparable<Player>{
    String playername;
    int playerScore;

    @Override
    public int compareTo(Player o) {
        return this.playerScore- o.playerScore;
    }

    public Player(String playername, int playerScore) {
        this.playername = playername;
        this.playerScore = playerScore;
    }


    @Override
    public String toString() {
        return "Player [playername=" + playername + ", playerScore=" + playerScore + "]";
    }

    
}
