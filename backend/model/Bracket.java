package model;

import enums.TournamentFormat;
import java.util.ArrayList;
import java.util.List;

public class Bracket {
    private long bracketId;
    private Tournament tournament;
    private TournamentFormat format;
    private List<Round> rounds;

    public Bracket() {
        this.rounds = new ArrayList<>();
    }

    public Bracket(long bracketId, Tournament tournament,
                   TournamentFormat format, List<Round> rounds) {
        this.bracketId = bracketId;
        this.tournament = tournament;
        this.format = format;
        this.rounds = rounds != null ? rounds : new ArrayList<>();
    }

    public long getBracketId() {
        return bracketId;
    }

    public void setBracketId(long bracketId) {
        this.bracketId = bracketId;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public TournamentFormat getFormat() {
        return format;
    }

    public void setFormat(TournamentFormat format) {
        this.format = format;
    }

    public List<Round> getRounds() {
        return rounds;
    }

    public void setRounds(List<Round> rounds) {
        this.rounds = rounds != null ? rounds : new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Bracket{" +
                "bracketId=" + bracketId +
                ", tournament=" + (tournament != null ? tournament.getName() : null) +
                ", format=" + format +
                ", rounds=" + rounds.size() +
                '}';
    }
}
