package com.code.Line.Backend.System.For.Managing.Players.Services;
import com.code.Line.Backend.System.For.Managing.Players.Model.Score;
import com.code.Line.Backend.System.For.Managing.Players.Repositories.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;

    private CopyOnWriteArrayList<Score> listOfScores = new CopyOnWriteArrayList<>();


    
    public Score createScore(Score addScore){
        addScore.setId(addScore.id);
        addScore.setScoreValue(addScore.scoreValue);
        return scoreRepository.save(addScore);
    }


}
