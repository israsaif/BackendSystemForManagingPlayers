package com.code.Line.Backend.System.For.Managing.Players.Services;

import com.code.Line.Backend.System.For.Managing.Players.Model.Player;
import com.code.Line.Backend.System.For.Managing.Players.Repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;






    public Player createPlayer(@RequestBody Player addPlayer) {
        playerRepository.save(addPlayer);
        return new Player();

    }
}
