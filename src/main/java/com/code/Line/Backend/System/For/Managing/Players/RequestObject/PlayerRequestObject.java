package com.code.Line.Backend.System.For.Managing.Players.RequestObject;
import com.code.Line.Backend.System.For.Managing.Players.Model.Player;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Setter
@Getter
@Data
public class PlayerRequestObject {

    public Integer id;
    public String name;




    public static Player special (PlayerRequestObject request){
       Player player = new Player();
       player.setName(request.getName());
       player.setIsActive(true);
       player.setCreatedDate(new Date());
       player.setUpdatedDate(new Date());
        return player;
    }
}
