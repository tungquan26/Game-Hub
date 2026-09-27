package ranking.service;

import ranking.model.PlayerRanking;
import ranking.model.TeamRanking;
import java.util.List;

public interface RankingService {
    List<PlayerRanking> rankPlayers(List<PlayerRanking> players);
    List<TeamRanking> rankTeams(List<TeamRanking> teams);
}