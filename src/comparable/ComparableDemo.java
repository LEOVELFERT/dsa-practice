package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Player> players=new ArrayList<>();
        players.add(new Player("balaji",2));
        players.add(new Player("leo",1));
        players.add(new Player("kavinkisore",3));
        Comparator<Player> playerComparator=(player1, player2)->  player1.getRanking()-player2.getRanking();   //just know if it returns -1 it will not swap if 0 no change if 1 it will change.
        players.sort(playerComparator);
        Collections.sort(players);
        System.out.println(players);
    }
}