package com.code.Line.Backend.System.For.Managing.Players.Services;
import com.code.Line.Backend.System.For.Managing.Players.Model.Score;
import com.code.Line.Backend.System.For.Managing.Players.Repositories.PlayerRepository;
import com.code.Line.Backend.System.For.Managing.Players.Repositories.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class ScoreService {


    @Autowired
    private ScoreRepository scoreRepository;

    private CopyOnWriteArrayList<Score> listOfScores = new CopyOnWriteArrayList<>();
    @Autowired
    private PlayerRepository playerRepository;


    public Score createScore(Score addScore){
        addScore.setId(addScore.id);
        addScore.setScoreValue(addScore.scoreValue);
        addScore.player = playerRepository.getReferenceById(addScore.player_id);
        return scoreRepository.save(addScore);
    }

    public List<Score> getAllScores(){
        return scoreRepository.findAll();
    }

   public Score getScoreInformation(Integer id){
        return scoreRepository.findById(id)
                .orElse(null);
   }
   public Score updateScoreInformation(@PathVariable(name = "id") Integer id, @RequestBody Score updateScore){
        Score currentScore =getScoreInformation(id);
        currentScore.setScoreValue(updateScore.getScoreValue());
       return scoreRepository.save(currentScore);
   }

}
