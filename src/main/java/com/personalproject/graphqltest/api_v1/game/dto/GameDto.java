package com.personalproject.graphqltest.api_v1.game.dto;

import com.personalproject.graphqltest.api_v1.player.dto.PlayerDto;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class GameDto {
    private String name;
    private Set<PlayerDto> players;
    public GameDto() {
        players = new HashSet<>();
    }
}
