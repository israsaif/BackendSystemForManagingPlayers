package com.code.Line.Backend.System.For.Managing.Players.ResponseObject;
import com.code.Line.Backend.System.For.Managing.Players.Model.Score;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
@Builder
public class ScoreResponseObject {
    public Integer id;
    public Integer scoreValue;


    public static ScoreResponseObject specialRequestToResponse(Score scoreRequest){
        return ScoreResponseObject.builder()
                .id(scoreRequest.getId())
                .scoreValue(scoreRequest.getScoreValue())
                .build();
    }


}
