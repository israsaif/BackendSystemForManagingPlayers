package com.code.Line.Backend.System.For.Managing.Players.Services;
import com.code.Line.Backend.System.For.Managing.Players.Model.Player;
import com.code.Line.Backend.System.For.Managing.Players.Repositories.PlayerRepository;

import com.code.Line.Backend.System.For.Managing.Players.RequestObject.PlayerRequestObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    private CopyOnWriteArrayList<Player> listOfPlayers = new CopyOnWriteArrayList<>();




//    public Player createPlayer(@RequestBody Player addPlayer) {
//        playerRepository.save(addPlayer);
//        return new  Player();
//
//    }
public void createPlayer(PlayerRequestObject playerRequestObject){
    Player player = PlayerRequestObject.special(playerRequestObject);
    playerRepository.save(player);
}


    public List<Player> getAllPlayers(){
        return playerRepository.getAllPlayers();
    }

    public List<Player> getAllPlayersByCreatedDate(String createdDate) {
        return playerRepository.getAllPlayersByCreatedDate(createdDate);
    }
    public List<Player> getAllActiveCustomers() {
        return playerRepository.getAllActivePlayers();
    }


    public Player getPlayerById(Integer playerId) {
    return playerRepository.getPlayerById(playerId);
}


//public Player updatePlayerInformation(PlayerRequestObject playerRequestObject) {
//        Player player = playerRepository.findById(playerRequestObject.getId());
//
//
//
//}



}
