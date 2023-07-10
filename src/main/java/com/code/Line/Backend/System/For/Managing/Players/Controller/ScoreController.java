package com.code.Line.Backend.System.For.Managing.Players.Controller;

import com.code.Line.Backend.System.For.Managing.Players.Services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/s1/Score")
public class ScoreController {
    @Autowired
    ScoreService scoreService;

}
