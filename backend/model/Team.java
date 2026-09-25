package model;

import enums.TeamStatus;
import java.util.ArrayList;
import java.util.List;

public class Team {
    private long teamId;
    private String teamName;
    private String description;
    private Player captain;
    private List<TeamMember> members;
    private TeamStatus status;

    public Team() {
        this.members = new ArrayList<>();
        this.status = TeamStatus.ACTIVE;
    }

    public Team(long teamId, String teamName, String description,
                Player captain, List<TeamMember> members, TeamStatus status) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.description = description;
        this.captain = captain;
        this.members = members != null ? members : new ArrayList<>();
        this.status = status;
    }

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Player getCaptain() {
        return captain;
    }

    public void setCaptain(Player captain) {
        this.captain = captain;
    }

    public List<TeamMember> getMembers() {
        return members;
    }

    public void setMembers(List<TeamMember> members) {
        this.members = members != null ? members : new ArrayList<>();
    }

    public TeamStatus getStatus() {
        return status;
    }

    public void setStatus(TeamStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", teamName='" + teamName + '\'' +
                ", description='" + description + '\'' +
                ", captain=" + (captain != null ? captain.getUsername() : null) +
                ", members=" + members.size() +
                ", status=" + status +
                '}';
    }
}
