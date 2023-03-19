package com.personalproject.graphqltest.api_v1.game;

import com.personalproject.graphqltest.api_v1.game.dto.AddPlayerDto;
import com.personalproject.graphqltest.api_v1.game.dto.CreateGameDto;
import com.personalproject.graphqltest.api_v1.game.dto.GameInfoDto;
import com.personalproject.graphqltest.entity.GameEntity;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/game")
@Tag(name = "Game manager")
@RequiredArgsConstructor
public class GameController {
    private final GameService service;

    @PostMapping
    @QueryMapping
    public GameEntity createGame(@RequestBody CreateGameDto createGameDto) {
        return service.createGame(createGameDto);
    }

    @GetMapping
    @QueryMapping
    public List<GameEntity> getAllGames() {
        return service.getAllGames();
    }

    @PostMapping("/add-player")
    @QueryMapping
    public GameEntity addPlayerToGame(@RequestBody AddPlayerDto addPlayerDto) {
        return service.addPlayerToGame(addPlayerDto);
    }

    @GetMapping("/{playerId}")
    @QueryMapping
    public List<GameInfoDto> getAllGamesByPlayerId(@PathVariable @Argument int playerId) {
        return service.getAllGamesByPlayerId(playerId);
    }
}
