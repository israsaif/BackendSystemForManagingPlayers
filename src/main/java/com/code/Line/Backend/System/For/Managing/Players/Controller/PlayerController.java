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


    @PostMapping//create
    public void createPlayer(@RequestBody PlayerRequestObject playerRequestObject){
        playerService.createPlayer(playerRequestObject);
    }
    @GetMapping(path = "{id}")//GetByID
    public PlayerResponseObject getPlayerById(@RequestParam Integer playerId) {
        Player player = playerService.getPlayerById(playerId);
        PlayerResponseObject playerResponse = PlayerResponseObject.specialRequestToResponse(player);
        return playerResponse;
    }


    @GetMapping//GetAll
    public List<PlayerResponseObject> getAllPlayers() {
        List<Player> listOfPlayers = playerService.getAllPlayers();
        List<PlayerResponseObject> playerResponseList = PlayerResponseObject.specialRequestListToResponselist(listOfPlayers);
        return playerResponseList;

    }

    @GetMapping(value = "getAllPlayerByCreatedDate")//getAllPlayersByCreatedDate
    public List<PlayerResponseObject> getAllPlayersByCreatedDate(@RequestParam String createdDate) {
        List<Player> listOfPlayers = playerService.getAllPlayersByCreatedDate(createdDate);
       List<PlayerResponseObject> playerResponseList = PlayerResponseObject.specialRequestListToResponselist(listOfPlayers);
        return playerResponseList;

    }

    @GetMapping(value = "getAllActivePlayers")
    public List<PlayerResponseObject> getAllActivePlayers(){
        List<Player> listOfPlayers = playerService.getAllActiveCustomers();
        List<PlayerResponseObject> playerResponseList = PlayerResponseObject.specialRequestListToResponselist(listOfPlayers);
        return playerResponseList;
    }




}