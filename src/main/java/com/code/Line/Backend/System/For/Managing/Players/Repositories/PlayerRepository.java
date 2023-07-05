package com.code.Line.Backend.System.For.Managing.Players.Repositories;

import com.code.Line.Backend.System.For.Managing.Players.Model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Integer> {

}
