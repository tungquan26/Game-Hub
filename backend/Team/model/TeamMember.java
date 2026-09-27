package team.model;

import enums.TeamMemberRole;
import user.model.Player;

import user.model.Player;

import user.model.Player;
import java.time.LocalDateTime;

public class TeamMember {
    private user.model.Player player;
    private LocalDateTime joinedAt;
    private TeamMemberRole role;
    private Player player
    public Player getPlayer()

    public TeamMember() {
    }

    public TeamMember(Player player, LocalDateTime joinedAt, TeamMemberRole role) {
        this.player = player;
        this.joinedAt = joinedAt;
        this.role = role;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public LocalDateTime getJoinedAt() {
        return joinedAt;
    }

    public void setJoinedAt(LocalDateTime joinedAt) {
        this.joinedAt = joinedAt;
    }

    public TeamMemberRole getRole() {
        return role;
    }

    public void setRole(TeamMemberRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "TeamMember{" +
                "player=" + (player != null ? player.getUsername() : null) +
                ", joinedAt=" + joinedAt +
                ", role=" + role +
                '}';
    }
}
