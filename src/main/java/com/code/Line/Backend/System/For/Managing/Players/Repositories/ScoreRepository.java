package com.code.Line.Backend.System.For.Managing.Players.Repositories;
import com.code.Line.Backend.System.For.Managing.Players.Model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Score,Integer> {
}
