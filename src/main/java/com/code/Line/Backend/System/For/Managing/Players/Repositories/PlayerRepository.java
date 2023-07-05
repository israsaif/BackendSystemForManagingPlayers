package com.code.Line.Backend.System.For.Managing.Players.Repositories;
import com.code.Line.Backend.System.For.Managing.Players.Model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;


public interface PlayerRepository extends JpaRepository<Player,Integer> {
   @Query(value = "select pla from Player pla")
   List<Player> getAllPlayers();
}
