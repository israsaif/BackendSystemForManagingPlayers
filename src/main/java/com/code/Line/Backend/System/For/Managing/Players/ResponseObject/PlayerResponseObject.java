package com.code.Line.Backend.System.For.Managing.Players.ResponseObject;

import com.code.Line.Backend.System.For.Managing.Players.Model.Player;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
@Builder
public class PlayerResponseObject {
    public Integer id;
    public String name;



    public static PlayerResponseObject specialRequestToResponse(Player playerRequest){
        return PlayerResponseObject.builder()
                .id(playerRequest.getId())
                .name(playerRequest.getName())

                .build();
    }
}

