package com.personalproject.graphqltest.api_v1.player;

import com.personalproject.graphqltest.entity.PlayerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends CrudRepository<PlayerEntity, Integer> {
}
