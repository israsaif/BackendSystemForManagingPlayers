package com.code.Line.Backend.System.For.Managing.Players.RequestObject;
import com.code.Line.Backend.System.For.Managing.Players.Model.Score;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@Data
public class ScoreRequestObject {
    public Integer id;
    public Integer scoreValue;


    public static Score special (ScoreRequestObject request){
        Score score = new Score();
        score.setId(request.getId());
        score.setScoreValue(request.getScoreValue());
        score.setCreatedDate(new Date());
        score.setUpdatedDate(new Date());
        score.setIsActive(true);
        return score;
    }


    public static List<Score> special(List<ScoreRequestObject> requestList){
        List<Score> scores = new ArrayList<>();
        if (!requestList.isEmpty()) {
            for (ScoreRequestObject scoreRequest : requestList){
                scores.add(special(scoreRequest));
            }
        }
        return scores;
    }





}
