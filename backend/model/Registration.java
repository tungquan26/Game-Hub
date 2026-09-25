package model;

import enums.CheckInStatus;
import enums.RegistrationStatus;
import java.time.LocalDateTime;

public class Registration {
    private long registrationId;
    private Team team;
    private Tournament tournament;
    private LocalDateTime registrationDate;
    private RegistrationStatus status;
    private CheckInStatus checkInStatus;

    public Registration() {
        this.status = RegistrationStatus.PENDING;
        this.checkInStatus = CheckInStatus.NOT_CHECKED_IN;
    }

    public Registration(long registrationId, Team team, Tournament tournament,
                        LocalDateTime registrationDate,
                        RegistrationStatus status,
                        CheckInStatus checkInStatus) {
        this.registrationId = registrationId;
        this.team = team;
        this.tournament = tournament;
        this.registrationDate = registrationDate;
        this.status = status;
        this.checkInStatus = checkInStatus;
    }

    public long getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(long registrationId) {
        this.registrationId = registrationId;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public RegistrationStatus getStatus() {
        return status;
    }

    public void setStatus(RegistrationStatus status) {
        this.status = status;
    }

    public CheckInStatus getCheckInStatus() {
        return checkInStatus;
    }

    public void setCheckInStatus(CheckInStatus checkInStatus) {
        this.checkInStatus = checkInStatus;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "registrationId=" + registrationId +
                ", team=" + (team != null ? team.getTeamName() : null) +
                ", tournament=" + (tournament != null ? tournament.getName() : null) +
                ", registrationDate=" + registrationDate +
                ", status=" + status +
                ", checkInStatus=" + checkInStatus +
                '}';
    }
}
