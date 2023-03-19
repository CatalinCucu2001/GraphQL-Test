package com.personalproject.graphqltest.utils.mapper;

import com.personalproject.graphqltest.api_v1.game.dto.CreateGameDto;
import com.personalproject.graphqltest.api_v1.game.dto.GameDto;
import com.personalproject.graphqltest.api_v1.game.dto.GameInfoDto;
import com.personalproject.graphqltest.entity.GameEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
public interface GameMapper {
    GameDto gameEntityToGameDto(GameEntity gameEntity);

    GameEntity gameDtoToGameEntity(GameDto gameDto);

    GameEntity createGameDtoToGameEntity(CreateGameDto createGameDto);

    List<GameInfoDto> GameEntityListToGameInfoDtoList(List<GameEntity> allByPlayerId);
}
