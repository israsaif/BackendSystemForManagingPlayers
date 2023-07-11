package com.code.Line.Backend.System.For.Managing.Players.Controller;
import com.code.Line.Backend.System.For.Managing.Players.Model.Player;
import com.code.Line.Backend.System.For.Managing.Players.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/player")
public class PlayerController {

    @Autowired
    PlayerService playerService;


    @PostMapping
    public Player createPlayer(@RequestBody Player addPlayer) {
        try{
            return playerService.createPlayer(addPlayer);
        }
        catch(Exception e){
            System.out.println("...");
        }
        return null;
    }
    @GetMapping
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
  @PutMapping
   public Player updatePlayerInformation(@PathVariable(name = "id") Integer id, @RequestBody Player incomingUpdatePlayer) {
        return playerService.updatePlayerInformation(id, incomingUpdatePlayer);
    }
    @DeleteMapping(path = "{id}")
    public Player deletePlayer(@PathVariable(name = "id")Integer id){
        return playerService.deletePlayer(id);
    }
    @GetMapping("/{averageScore}/rank")
    public String fixRank(@PathVariable double averageScore) {
        return playerService.fixRank(averageScore);
    }
}


