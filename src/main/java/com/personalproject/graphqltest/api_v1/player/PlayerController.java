package com.personalproject.graphqltest.api_v1.player;

import com.personalproject.graphqltest.api_v1.player.dto.PlayerDto;
import com.personalproject.graphqltest.entity.PlayerEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PlayerController {
    private PlayerService service;

    @PostMapping("")
    public PlayerEntity createPlayer(@RequestBody PlayerDto playerDto) {
        return  service.createPlayer(playerDto);
    }
}
