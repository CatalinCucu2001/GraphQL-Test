package com.personalproject.graphqltest.utils.mapper;

import com.personalproject.graphqltest.api_v1.player.dto.PlayerDto;
import com.personalproject.graphqltest.entity.PlayerEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
public interface PlayerMapper {
    PlayerDto playerEntityToPlayerDto(PlayerEntity playerEntity);
    PlayerEntity playerDtoToPlayerEntity(PlayerDto playerDto);
}
