package com.personalproject.graphqltest.api_v1.player.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PlayerDto {
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
}
