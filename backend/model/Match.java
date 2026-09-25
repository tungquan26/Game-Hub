package model;

import enums.MatchStatus;
import java.time.LocalDateTime;

public class Match {
    private long matchId;
    private Team teamA;
    private Team teamB;
    private LocalDateTime scheduledTime;
    private Round round;
    private MatchStatus status;
    private MatchResult result;

    public Match() {
        this.status = MatchStatus.SCHEDULED;
    }

    public Match(long matchId, Team teamA, Team teamB,
                 LocalDateTime scheduledTime, Round round,
                 MatchStatus status, MatchResult result) {
        this.matchId = matchId;
        this.teamA = teamA;
        this.teamB = teamB;
        this.scheduledTime = scheduledTime;
        this.round = round;
        this.status = status;
        this.result = result;
    }

    public long getMatchId() {
        return matchId;
    }

    public void setMatchId(long matchId) {
        this.matchId = matchId;
    }

    public Team getTeamA() {
        return teamA;
    }

    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    public void setTeamB(Team teamB) {
        this.teamB = teamB;
    }

    public LocalDateTime getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(LocalDateTime scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public Round getRound() {
        return round;
    }

    public void setRound(Round round) {
        this.round = round;
    }

    public MatchStatus getStatus() {
        return status;
    }

    public void setStatus(MatchStatus status) {
        this.status = status;
    }

    public MatchResult getResult() {
        return result;
    }

    public void setResult(MatchResult result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Match{" +
                "matchId=" + matchId +
                ", teamA=" + (teamA != null ? teamA.getTeamName() : null) +
                ", teamB=" + (teamB != null ? teamB.getTeamName() : null) +
                ", scheduledTime=" + scheduledTime +
                ", round=" + (round != null ? round.getName() : null) +
                ", status=" + status +
                ", result=" + result +
                '}';
    }
}
