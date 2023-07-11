package com.code.Line.Backend.System.For.Managing.Players.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@Data
@Entity
public class Team  {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public String teamName;
    public List<Player> players;
}
