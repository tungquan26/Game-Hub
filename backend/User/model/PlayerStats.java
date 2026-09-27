package User.model;

public class PlayerStats {

    private double eloScore;
    private int matchesPlayed;
    private int wins;

    public PlayerStats() {
        this.eloScore = 1200.0;
        this.matchesPlayed = 0;
        this.wins = 0;
    }

    public void updateElo(boolean isWinner, double opponentElo) {
        this.matchesPlayed++;
        if (isWinner) {
            this.wins++;
            this.eloScore += 20 + (opponentElo - this.eloScore) * 0.1; 
        } else {
            this.eloScore -= 20 - (this.eloScore - opponentElo) * 0.1;
        }
    }

    public double getEloScore() { 
        return eloScore; 
    }
    
    public double getWinRate() { 
        return matchesPlayed == 0 ? 0 : ((double) wins / matchesPlayed) * 100; 
    }
}
