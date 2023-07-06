package com.code.Line.Backend.System.For.Managing.Players.Repositories;
import com.code.Line.Backend.System.For.Managing.Players.Model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer> {
   @Query(value = "select pla from Player pla")
   List<Player> getAllPlayers();


   @Query(value = "select pla from Player pla where pla.id = :playerId")
   Player getPlayerById(@Param("playerId") Integer playerId);

   @Query(value = "select * from Player where created_Date Like concat (?1,%)", nativeQuery = true)
   List<Player> getAllPlayersByCreatedDate(@Param("createdDate") String createdDate);


}
