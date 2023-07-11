package com.code.Line.Backend.System.For.Managing.Players.Services;

import com.code.Line.Backend.System.For.Managing.Players.Model.Player;
import com.code.Line.Backend.System.For.Managing.Players.Repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatchmakerService {

@Autowired
    PlayerRepository playerRepository;
        public boolean isMatchValid(List<String> playerIds) {
            // Check if the number of players is valid
            if (playerIds.size() != 6) {
                return false;
            }

            // Create two teams
            List<Player> blueTeamPlayers = new ArrayList<>();
            List<Player> redTeamPlayers = new ArrayList<>();

            // Fetch players and assign them to the teams
            for (Integer playerId : playerIds) {
                Player player = getPlayerById(playerId);
                if (player != null) {
                    if (blueTeamPlayers.size() < 3) {
                        blueTeamPlayers.add(player);
                    } else {
                        redTeamPlayers.add(player);
                    }
                }
            }

            // Check if both teams are complete
            if (blueTeamPlayers.size() != 3 || redTeamPlayers.size() != 3) {
                return false;
            }

            // Calculate average scores for both teams
            double blueTeamAvgScore = calculateAverageScore(blueTeamPlayers);
            double redTeamAvgScore = calculateAverageScore(redTeamPlayers);

            // Check if the difference between average scores is less than 5
            if (Math.abs(blueTeamAvgScore - redTeamAvgScore) < 5) {
                return true;
            }

            return false;
        }

        private Player getPlayerById(int playerId) {
            return playerRepository.findById(playerId)
                    .orElse(null);
            // Fetch player from database or any other data source
            // Return null if player is not found
        }

    private double calculateAverageScore(List<Player> players) {
        // TODO: Have to fix this later
//        int totalScore = 0;
//        for (Player player : players) {
//            totalScore = totalScore + player.getScores();
//
//
//        }
//        return totalScore / (double) players.size();
        return 0.0;
    }
    }


