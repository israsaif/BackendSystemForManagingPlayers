package com.code.Line.Backend.System.For.Managing.Players.Services;
import com.code.Line.Backend.System.For.Managing.Players.Model.Player;
import com.code.Line.Backend.System.For.Managing.Players.Repositories.PlayerRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    private CopyOnWriteArrayList<Player> listOfPlayers = new CopyOnWriteArrayList<>();

    public Player createPlayer( Player addPlayer) {
        addPlayer.setCreatedDate(new Date());
        return playerRepository.save(addPlayer);

    }

    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }
    public Player getPlayerInformation(Integer id) {
        return playerRepository.findById(id)
                .orElse(null);
    }
    public Player updatePlayerInformation(@PathVariable(name = "id") Integer incomingId, @RequestBody Player incomingUpdatePlayer) {
        Player currentPlayer = getPlayerInformation(incomingId);
        currentPlayer.setName(incomingUpdatePlayer.getName());
        return playerRepository.save(currentPlayer);
    }
}
