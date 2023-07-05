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





}
