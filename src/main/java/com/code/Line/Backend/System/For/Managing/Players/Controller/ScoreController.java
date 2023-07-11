package com.code.Line.Backend.System.For.Managing.Players.Controller;
import com.code.Line.Backend.System.For.Managing.Players.Model.Score;
import com.code.Line.Backend.System.For.Managing.Players.Services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "api/v1/Score")
public class ScoreController {
    @Autowired
    ScoreService scoreService;
    @PostMapping//create
    public Score  createScore (@RequestBody Score addScore){
        return scoreService.createScore(addScore);
    }
    @GetMapping("All")//GetAll
    public List<Score> getScoreInformation(){
        return scoreService.getAllScores();
     }
    @GetMapping(path = "{id}")//GetByID
    public Score getScoreInformation(@PathVariable(name = "id")Integer id){
        Score ScoreFound = null;
        if (id != null && id > 0) {
            ScoreFound = scoreService.getScoreInformation(id);
        }
        return ScoreFound;
    }

    @PutMapping
    public Score updateScoreInformation(@PathVariable(name = "id") Integer id, @RequestBody Score updateScore) {
        return scoreService.updateScoreInformation(id, updateScore);
    }
    @DeleteMapping(path = "{id}")
    public Score deleteScore(@PathVariable(name = "id")Integer id){
        return scoreService.deleteScore(id);
    }
    @GetMapping(path = "getPlayerAverageScore/{playerId}")
    public Integer calculateAverageScore(@PathVariable(name = "playerId")Integer playerId) {
        return (int) scoreService.calculateAverageScore(playerId.intValue());
    }
    @GetMapping(path = "getPlayers")
    public Map<Integer, Double> calculateAverageScoreForAllPlayers(@RequestBody List<Integer> playerIds){
        return scoreService.calculateAverageScoreForAllPlayers(playerIds);
    }
}
