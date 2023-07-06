package com.code.Line.Backend.System.For.Managing.Players.ResponseObject;

import com.code.Line.Backend.System.For.Managing.Players.Model.Player;
import com.code.Line.Backend.System.For.Managing.Players.RequestObject.PlayerRequestObject;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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

     public static List<PlayerResponseObject> specialRequestListToResponselist(List<Player> playerRequest) {
         List<PlayerResponseObject> specialRequestListToResponse = new ArrayList<>();
         if (!playerRequest.isEmpty()) {
             for (Player playerRequestList : playerRequest) {
               specialRequestListToResponse.add(specialRequestToResponse(playerRequestList));
             }
         }
         return specialRequestListToResponse;
     }


}

