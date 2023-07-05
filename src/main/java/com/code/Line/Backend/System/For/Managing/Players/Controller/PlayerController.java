package com.code.Line.Backend.System.For.Managing.Players.Controller;


import com.code.Line.Backend.System.For.Managing.Players.Model.Player;
import com.code.Line.Backend.System.For.Managing.Players.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/p1/Player")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @PostMapping//create
    public Player createPlayer(@RequestBody Player addPlayer) {
        return playerService.createPlayer(addPlayer);
    }

}
