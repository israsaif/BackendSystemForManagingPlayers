package com.code.Line.Backend.System.For.Managing.Players.Controller;
import com.code.Line.Backend.System.For.Managing.Players.Services.MatchmakerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchController {
    private MatchmakerService matchmakerService;

    @PostMapping("/validate")
    public ResponseEntity<String> validateMatch(@RequestBody List<String> playerIds) {
        boolean isValid = matchmakerService.isMatchValid(playerIds);
        if (isValid) {
            return ResponseEntity.ok("Match is valid.");
        } else {
            return ResponseEntity.badRequest().body("Match is not valid.");
        }
    }
}
