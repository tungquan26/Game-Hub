package Tournament.model;

import enums.TournamentFormat;
import enums.TournamentStatus;
import Match.model.Match;
import User.model.Organizer;
import Registration.model.Registration;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

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
    private List<Registration> registrations;
    private List<Match> matches;

    public Tournament() {
        this.registrations = new ArrayList<>();
        this.matches = new ArrayList<>();
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

        this.registrations = new ArrayList<>();
        this.matches = new ArrayList<>();
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

    public List<Registration> getRegistrations() {
        return registrations;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void addRegistration(Registration registration) {
        if (registration != null) {
            this.registrations.add(registration);
        }
    }

    public void addMatch(Match match) {
        if (match != null) {
            this.matches.add(match);
        }
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
