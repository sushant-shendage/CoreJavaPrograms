// package javapgms.collection.comparableAndcomparator.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DriverComparatorlambda {

    public static void main(String[] args) {

       ArrayList <Players> playrss=  new ArrayList<Players>();
       playrss.add(new Players("A-player", 30));
       playrss.add(new Players("B-player", 20));
       playrss.add(new Players("C-player1", 10));

    //    Comparator <Players> c=(o1,o2)->o2.playerScore-o1.playerScore;
    //    playrss.sort(c);
    //    System.out.println(playrss);

    }
}
class Players {
    String playerName;
    int playerScore;


    public Players(String playerName, int playerScore) {
        this.playerName = playerName;
        this.playerScore = playerScore;
    }


    public String getPlayerName() {
        return playerName;
    }


    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }


    public int getPlayerScore() {
        return playerScore;
    }


    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }


    @Override
    public String toString() {
        return "Players [playerName=" + playerName + ", playerScore=" + playerScore + "]";
    }

    
}
