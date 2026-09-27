package ranking.service;

import ranking.model.PlayerRanking;
import ranking.model.TeamRanking;
import java.util.Collections;
import java.util.List;

public class RankingServiceImpl implements RankingService {

    @Override
    public List<PlayerRanking> rankPlayers(List<PlayerRanking> players) {
        Collections.sort(players);
        
        for (int i = 0; i < players.size(); i++) {
            players.get(i).setCurrentRank(i + 1);
        }
        return players;
    }

    @Override
    public List<TeamRanking> rankTeams(List<TeamRanking> teams) {
        Collections.sort(teams);
        
        for (int i = 0; i < teams.size(); i++) {
            teams.get(i).setCurrentRank(i + 1);
        }
        return teams;
    }
}