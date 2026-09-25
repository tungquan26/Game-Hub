package model;

import enums.TournamentFormat;
import enums.TournamentStatus;
import java.time.LocalDateTime;

public class Tournament {
    private long tournamentId;
    private String name;
    private String game;
    private Organizer organizer;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int maxTeams;
    private TournamentFormat format;
    private TournamentStatus status;

    public Tournament() {
    }

    public Tournament(long tournamentId, String name, String game,
                      Organizer organizer, LocalDateTime startDate,
                      LocalDateTime endDate, int maxTeams,
                      TournamentFormat format, TournamentStatus status) {
        this.tournamentId = tournamentId;
        this.name = name;
        this.game = game;
        this.organizer = organizer;
        this.startDate = startDate;
        this.endDate = endDate;
        this.maxTeams = maxTeams;
        this.format = format;
        this.status = status;
    }

    public long getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(long tournamentId) {
        this.tournamentId = tournamentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public int getMaxTeams() {
        return maxTeams;
    }

    public void setMaxTeams(int maxTeams) {
        this.maxTeams = maxTeams;
    }

    public TournamentFormat getFormat() {
        return format;
    }

    public void setFormat(TournamentFormat format) {
        this.format = format;
    }

    public TournamentStatus getStatus() {
        return status;
    }

    public void setStatus(TournamentStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tournament{" +
                "tournamentId=" + tournamentId +
                ", name='" + name + '\'' +
                ", game='" + game + '\'' +
                ", organizer=" + (organizer != null ? organizer.getUsername() : null) +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", maxTeams=" + maxTeams +
                ", format=" + format +
                ", status=" + status +
                '}';
    }
}
