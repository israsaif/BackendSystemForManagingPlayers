package com.code.Line.Backend.System.For.Managing.Players.RequestObject;
import com.code.Line.Backend.System.For.Managing.Players.Model.Player;
import com.code.Line.Backend.System.For.Managing.Players.ResponseObject.PlayerResponseObject;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@Data
public class PlayerRequestObject {

    public Integer id;
    public String name;


    public static Player special(PlayerRequestObject request) {
        Player player = new Player();
        player.setName(request.getName());
        player.setIsActive(true);
        player.setCreatedDate(new Date());
        player.setUpdatedDate(new Date());
        return player;
    }


    public static List<Player> special(List<PlayerRequestObject> requestList) {
        List<Player> players = new ArrayList<>();
        if (!requestList.isEmpty()) {
            for (PlayerRequestObject playerRequest : requestList) {
                players.add(special(playerRequest));
            }
        }
        return players;

    }


}