package com.code.Line.Backend.System.For.Managing.Players.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Player extends BaseEntity{
    @Id
    public String id;
    public String name;
}
