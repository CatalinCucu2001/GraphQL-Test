package com.personalproject.graphqltest.api_v1.player;

import com.personalproject.graphqltest.api_v1.player.dto.PlayerDto;
import com.personalproject.graphqltest.entity.PlayerEntity;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
@Tag(name = "Player manager")
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class PlayerController {
    private final PlayerService service;

    @PostMapping
    public PlayerEntity createPlayer(@RequestBody PlayerDto playerDto) {
        return service.createPlayer(playerDto);
    }

    @GetMapping
    public List<PlayerEntity> getAllPlayers() {
        return service.getAllPlayers();
    }
}
