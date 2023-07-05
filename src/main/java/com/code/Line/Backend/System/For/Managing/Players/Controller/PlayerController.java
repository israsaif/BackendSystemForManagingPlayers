package com.code.Line.Backend.System.For.Managing.Players.Controller;
import com.code.Line.Backend.System.For.Managing.Players.Model.Player;
import com.code.Line.Backend.System.For.Managing.Players.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/p1/Player")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @PostMapping//create
    public Player createPlayer(@RequestBody Player addPlayer) {
        return playerService.createPlayer(addPlayer);
    }

    @GetMapping//GetAll
    public List<Player> getPlayerInformation() {
        return playerService.getAllPlayers();
    }

    @GetMapping(path = "{id}")//GetByID
    public Player getPlayerInformation(@PathVariable(name = "id") Integer id) {
        Player playerFound = null;
        if (id != null && id > 0) {
            playerFound = playerService.getPlayerInformation(id);
        }
        return playerFound;
    }


}
