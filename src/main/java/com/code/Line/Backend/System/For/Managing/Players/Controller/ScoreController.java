package com.code.Line.Backend.System.For.Managing.Players.Controller;
import com.code.Line.Backend.System.For.Managing.Players.Model.Score;
import com.code.Line.Backend.System.For.Managing.Players.Services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "api/v2/Score")
public class ScoreController {
    @Autowired
    ScoreService scoreService;
    @PostMapping//create
    public Score  createScore (@RequestBody Score addScore){
        return scoreService.createScore(addScore);
    }
    @GetMapping//GetAll
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



}
