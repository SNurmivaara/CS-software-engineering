package ohtu;

public class TennisGame {
    
    private Scoreboard scoreboard;

    public TennisGame(String player1Name, String player2Name) {
        this.scoreboard = new Scoreboard(player1Name, player2Name);
    }

    public void wonPoint(String playerName) {
        this.scoreboard.addPointToPlayer(playerName);
    }

    public String getScore() {
        return this.scoreboard.getScore();
    }
}