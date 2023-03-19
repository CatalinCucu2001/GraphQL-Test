package com.personalproject.graphqltest.api_v1.game;


import com.personalproject.graphqltest.entity.GameEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends CrudRepository<GameEntity, Integer> {

    @Query("select game from GameEntity as game join game.players as player where player.id = :playerId")
    List<GameEntity> getAllByPlayerId(int playerId);

}
