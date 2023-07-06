package com.code.Line.Backend.System.For.Managing.Players.Controller;
import com.code.Line.Backend.System.For.Managing.Players.Model.Player;
import com.code.Line.Backend.System.For.Managing.Players.RequestObject.PlayerRequestObject;
import com.code.Line.Backend.System.For.Managing.Players.ResponseObject.PlayerResponseObject;
import com.code.Line.Backend.System.For.Managing.Players.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/p1/Player")
public class PlayerController {

    @Autowired
    PlayerService playerService;

//    @PostMapping//create
//    public Player createPlayer(@RequestBody Player addPlayer) {
//        return playerService.createPlayer(addPlayer);
//    }
//


    @PostMapping//create
    public void createPlayer(@RequestBody PlayerRequestObject playerRequestObject){
        playerService.createPlayer(playerRequestObject);
    }


    @GetMapping//GetAll
    public List<Player> getPlayerInformation() {
        return playerService.getAllPlayers();
    }


//    @GetMapping(path = "{id}")//GetByID
//    public Player getPlayerId(@PathVariable(name = "id") Integer id) {
//        Player playerFound = null;
//        if (id != null && id > 0) {
//            playerFound = playerService.getPlayerInformation(id);
//        }
//        return playerFound;
//    }
@GetMapping(path = "{id}")//GetByID
public PlayerResponseObject getPlayerById(@RequestParam Integer playerId) {
    Player player = playerService.getPlayerById(playerId);
    PlayerResponseObject playerResponse = PlayerResponseObject.specialRequestToResponse(player);
    return playerResponse;
}

//    @PutMapping(path = "{id}")
//    public Player updatePlayerInformation( @RequestBody PlayerRequestObject playerRequestObject) {
//    return playerService.updatePlayerInformation(playerRequestObject);
//}
//}
}