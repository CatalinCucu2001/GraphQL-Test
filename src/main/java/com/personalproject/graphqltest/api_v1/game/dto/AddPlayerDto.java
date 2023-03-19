package com.personalproject.graphqltest.api_v1.game.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddPlayerDto {
    @NotBlank
    private int gameId;

    @NotBlank
    private int playerId;
}
