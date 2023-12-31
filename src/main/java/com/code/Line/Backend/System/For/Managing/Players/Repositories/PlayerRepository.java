package com.code.Line.Backend.System.For.Managing.Players.Repositories;
import com.code.Line.Backend.System.For.Managing.Players.Model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer> {
//   @Query(value = "select pla from Player pla")
//   List<Player> getAllPlayers();
//
//
   @Query(value = "select pla from Player pla where pla.id = :playerId")
   Optional<Player> findById(@Param("playerId") Integer playerId);
}
