package com.code.Line.Backend.System.For.Managing.Players.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    public Integer player_id = 0;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_ref", nullable = true)
    @JsonIgnore
    public Player player;
}
