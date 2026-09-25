package model;

import java.util.ArrayList;
import java.util.List;

public class Round {
    private int roundNumber;
    private String name;
    private List<Match> matches;

    public Round() {
        this.matches = new ArrayList<>();
    }

    public Round(int roundNumber, String name, List<Match> matches) {
        this.roundNumber = roundNumber;
        this.name = name;
        this.matches = matches != null ? matches : new ArrayList<>();
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches != null ? matches : new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Round{" +
                "roundNumber=" + roundNumber +
                ", name='" + name + '\'' +
                ", matches=" + matches.size() +
                '}';
    }
}
