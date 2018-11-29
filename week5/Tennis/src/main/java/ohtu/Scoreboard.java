package ohtu;


import java.rmi.UnexpectedException;

// For the tennis noob as the programmer of this:
// scores are announced as love, 15, 30, 40 and game in format XX-YY
// witch exceptions:
// 1) when both have same it is announced as XX-all ie. 15-all
// 2) when both have 40 it is announced as "Deuce"
// 3) winning a "deuce" results in "Advantage playerX"
// 4) After a deuce one player has to get 2 consecutive wins to win
public class Scoreboard {
    private Player player1;
    private Player player2;
    private String[] tennisTerms = {"Love", "Fifteen", "Thirty", "Forty"};

    public Scoreboard(String player1, String player2) {
        this.player1 = new Player(player1);
        this.player2 = new Player(player2);
    }

    public void addPointToPlayer(String name) {
        if (player1.getName().equals(name)) {
            player1.addPoint();
        } else {
            player2.addPoint();
        }
    }

    public String getScore() {
        // Handle case 1) and 2) first
        if (player1.getPoints() == player2.getPoints()){
            if (player1.getPoints() > 3) {
                return "Deuce";
            } else {
                return getTennisTerm(player1.getPoints()) + "-All";
            }
        }

        // Handle case 3) and 4) next
        if (player1.getPoints() >= 4 || player2.getPoints() >= 4) {
            int lead = player1.getPoints() - player2.getPoints(); // positive number is a lead for player1 and negative for player 2
            switch(lead){
                case 1:
                    return "Advantage player1";
                case -1:
                    return "Advantage player2";
                case 2:
                    return "Win for player1";
                case -2:
                    return "Win for player2";
            }
        }

        // Default case, check if a player has won and if not announce normally
        if (player1.getPoints() == 4) return "Win for player1";
        if (player2.getPoints() == 4) return "Win for player2";
        return getTennisTerm(player1.getPoints()) + "-" + getTennisTerm(player2.getPoints());
    }

    public String getTennisTerm(int score) {
        return this.tennisTerms[score];
    }
}
