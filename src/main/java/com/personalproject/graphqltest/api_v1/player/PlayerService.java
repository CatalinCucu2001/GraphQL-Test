package com.personalproject.graphqltest.api_v1.player;

import com.personalproject.graphqltest.api_v1.player.dto.PlayerDto;
import com.personalproject.graphqltest.entity.PlayerEntity;
import com.personalproject.graphqltest.utils.mapper.PlayerMapper;

public class PlayerService {
    PlayerRepository repository;

    PlayerMapper mapper;
    public PlayerEntity createPlayer(PlayerDto playerDto) {
        return repository.save(mapper.playerDtoToPlayerEntity(playerDto));
    }

//    public List<PlayerEntity>
}
