package model;

public class MatchResult {
    private int scoreA;
    private int scoreB;
    private Team winner;

    public MatchResult() {
    }

    public MatchResult(int scoreA, int scoreB, Team winner) {
        this.scoreA = scoreA;
        this.scoreB = scoreB;
        this.winner = winner;
    }

    public int getScoreA() {
        return scoreA;
    }

    public void setScoreA(int scoreA) {
        this.scoreA = scoreA;
    }

    public int getScoreB() {
        return scoreB;
    }

    public void setScoreB(int scoreB) {
        this.scoreB = scoreB;
    }

    public Team getWinner() {
        return winner;
    }

    public void setWinner(Team winner) {
        this.winner = winner;
    }

    @Override
    public String toString() {
        return "MatchResult{" +
                "scoreA=" + scoreA +
                ", scoreB=" + scoreB +
                ", winner=" + (winner != null ? winner.getTeamName() : null) +
                '}';
    }
}
