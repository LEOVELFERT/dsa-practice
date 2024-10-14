package comparable;

public class Player implements Comparable<Player> {
    String playerName;
    int Ranking;
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getRanking() {
        return Ranking;
    }

    public void setRanking(int ranking) {
        Ranking = ranking;
    }

    public Player(String playerName, int ranking) {
        this.playerName = playerName;
        Ranking = ranking;
    }


    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", Ranking=" + Ranking +
                '}';
    }


    @Override
    public int compareTo(Player thatPlayer) {
        return thatPlayer.getRanking()-this.getRanking();
    }
}
