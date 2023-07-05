package com.code.Line.Backend.System.For.Managing.Players.Services;
import com.code.Line.Backend.System.For.Managing.Players.Model.Player;
import com.code.Line.Backend.System.For.Managing.Players.Repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    private CopyOnWriteArrayList<Player> listOfPlayers = new CopyOnWriteArrayList<>();




    public Player createPlayer(@RequestBody Player addPlayer) {
        playerRepository.save(addPlayer);

        return new  Player();

    }


    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }

    public Player getPlayerInformation(Integer id) {
        return playerRepository.findById(id)
                .orElse(null);
    }
}
