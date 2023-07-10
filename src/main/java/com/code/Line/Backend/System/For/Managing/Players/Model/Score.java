package com.code.Line.Backend.System.For.Managing.Players.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
@Entity
public class Score extends BaseEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public Integer id;
    public Integer scoreValue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_id", nullable = false)
    public Player player;
}
