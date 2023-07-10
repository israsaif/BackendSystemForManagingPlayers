package com.code.Line.Backend.System.For.Managing.Players.Controller;

import com.code.Line.Backend.System.For.Managing.Players.Model.Score;
import com.code.Line.Backend.System.For.Managing.Players.Services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/Score")
public class ScoreController {
    @Autowired
    ScoreService scoreService;
    @PostMapping//create
    public Score  createScore (@RequestBody Score addScore){
        return scoreService.createScore(addScore);
    }

}
