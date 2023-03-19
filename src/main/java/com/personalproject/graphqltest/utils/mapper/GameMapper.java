package com.personalproject.graphqltest.utils.mapper;

import com.personalproject.graphqltest.api_v1.game.dto.GameDto;
import com.personalproject.graphqltest.entity.GameEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
public interface GameMapper {
    GameDto gameEntityToGameDto(GameEntity gameEntity);
    GameEntity gameDtoToGameEntity(GameDto gameDto);
}
