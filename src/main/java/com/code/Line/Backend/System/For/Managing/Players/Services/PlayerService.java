package com.code.Line.Backend.System.For.Managing.Players.Services;
import com.code.Line.Backend.System.For.Managing.Players.Model.Player;
import com.code.Line.Backend.System.For.Managing.Players.Repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    private CopyOnWriteArrayList<Player> listOfPlayers = new CopyOnWriteArrayList<>();

    public Player createPlayer( Player addPlayer) {
        addPlayer.setId(addPlayer.id);
        addPlayer.setName(addPlayer.name);
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
    public Player deletePlayer(@PathVariable(name = "id")Integer id){
        Player currentPlayer = getPlayerInformation(id);
        playerRepository.delete(currentPlayer);
        return currentPlayer;

    }
    public String fixRank(double averageScore) {
        if (averageScore >= 0 && averageScore < 10) {
            return "Iron";
        } else if (averageScore >= 10 && averageScore < 20) {
            return "Bronze";
        } else if (averageScore >= 20 && averageScore < 30) {
            return "Silver";
        } else if (averageScore >= 30 && averageScore < 40) {
            return "Gold";
        } else if (averageScore >= 40 && averageScore < 50) {
            return "Platinum";
        } else if (averageScore == 50) {
            return "Immortal";
        } else {
            return "Invalid score range";
        }
    }

}
