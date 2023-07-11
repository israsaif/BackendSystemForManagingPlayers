package com.code.Line.Backend.System.For.Managing.Players.Controller;

import com.code.Line.Backend.System.For.Managing.Players.Model.Player;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchController {
    @PostMapping
    public ResponseEntity<String> createMatch(@RequestBody List<String> playerIds) {
        if (playerIds.size() != 6) {
            return ResponseEntity.badRequest().body("Please provide exactly six player IDs.");
        }

        // Retrieve players from the database or any other source based on the IDs
        List<Player> players = getPlayerList(playerIds);

        // Divide the players into two teams
        List<Player> team1 = players.subList(0, 3);
        List<Player> team2 = players.subList(3, 6);

        // Calculate the average scores for both teams
        double averageScoreTeam1 = calculateAverageScore(team1);
        double averageScoreTeam2 = calculateAverageScore(team2);

        // Check if the match is valid
        if (Math.abs(averageScoreTeam1 - averageScoreTeam2) < 5) {
            return ResponseEntity.ok("Match is valid.");
        } else {
            return ResponseEntity.ok("Match is not valid.");
        }
    }
}
