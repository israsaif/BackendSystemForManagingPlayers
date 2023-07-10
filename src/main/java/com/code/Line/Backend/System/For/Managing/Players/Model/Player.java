package com.code.Line.Backend.System.For.Managing.Players.Model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Data
@Entity
public class Player extends BaseEntity{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public Integer id;
    public String name;

    public  String rank;
    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL)
    private List<Score> scores;


}
