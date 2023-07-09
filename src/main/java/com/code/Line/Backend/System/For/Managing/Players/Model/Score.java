package com.code.Line.Backend.System.For.Managing.Players.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
@Entity
public class Score {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public Integer id;
    public Integer playerId;
    public Integer scoreValue;
}
