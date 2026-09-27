package ranking.model;

import user.model.Player;

public class PlayerRanking implements Comparable<PlayerRanking> {

    public int getCurrentRank() { 
        return currentRank; 
    }

    private Player player;
    private int currentRank;

    public PlayerRanking(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setCurrentRank(int currentRank) {
        this.currentRank = currentRank;
    }

    // Lấy trực tiếp Elo từ thuộc tính stats của Player
    public double getRankingScore() {
        if (player != null && player.getStats() != null) {
            return player.getStats().getEloScore();
        }
        return 0.0;
    }

    // Sắp xếp người chơi theo thứ tự Elo giảm dần
    @Override
    public int compareTo(PlayerRanking other) {
        return Double.compare(other.getRankingScore(), this.getRankingScore());
    }
}
