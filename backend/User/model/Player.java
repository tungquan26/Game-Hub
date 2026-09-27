package model;

import enums.UserRole;

public class Player extends User {

    private PlayerStats stats = new PlayerStats();

    public Player() {
        super();
        setRole(UserRole.PLAYER);
    }

    public Player(long userId, String username, String password, String email,
                  String fullName) {
        super(userId, username, password, email, fullName, UserRole.PLAYER);
    }

    public PlayerStats getStats() {
        return stats;
    }

    public void setStats(PlayerStats stats) {
        this.stats = stats;
    }
}
