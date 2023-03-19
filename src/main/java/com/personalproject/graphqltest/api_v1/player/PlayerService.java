package com.personalproject.graphqltest.api_v1.player;

import com.personalproject.graphqltest.api_v1.player.dto.PlayerDto;
import com.personalproject.graphqltest.entity.PlayerEntity;
import com.personalproject.graphqltest.utils.mapper.PlayerMapper;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class PlayerService {
    private final PlayerRepository repository;

    private final PlayerMapper mapper = Mappers.getMapper(PlayerMapper.class);
//    private final PlayerMapper mapper;

    public PlayerEntity createPlayer(PlayerDto playerDto) {
        return repository.save(mapper.playerDtoToPlayerEntity(playerDto));
    }

    public List<PlayerEntity> getAllPlayers() {
        return StreamSupport.stream(repository.findAll().spliterator(), false).toList();
    }

    public PlayerEntity getPlayerById(int playerId) {
        return repository.findById(playerId).orElseThrow(() -> new IllegalArgumentException("Player not found!"));
    }
}
