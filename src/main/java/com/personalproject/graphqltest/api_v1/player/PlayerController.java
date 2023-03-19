package com.personalproject.graphqltest.api_v1.player;

import com.personalproject.graphqltest.api_v1.player.dto.PlayerDto;
import com.personalproject.graphqltest.entity.PlayerEntity;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
@Tag(name = "Player manager")
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService service;

    @PostMapping
    @QueryMapping
    public PlayerEntity createPlayer(@RequestBody @Argument PlayerDto playerDto) {
        return service.createPlayer(playerDto);
    }

    @GetMapping
    @QueryMapping
    public List<PlayerEntity> getAllPlayers() {
        return service.getAllPlayers();
    }
}
