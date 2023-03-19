package com.personalproject.graphqltest.api_v1.game;

import com.personalproject.graphqltest.api_v1.game.dto.AddPlayerDto;
import com.personalproject.graphqltest.api_v1.game.dto.CreateGameDto;
import com.personalproject.graphqltest.api_v1.game.dto.GameInfoDto;
import com.personalproject.graphqltest.entity.GameEntity;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/game")
@Tag(name = "Game manager")
@RequiredArgsConstructor
public class GameController {
    private final GameService service;

    @PostMapping
    public GameEntity createGame(@RequestBody CreateGameDto createGameDto) {
        return service.createGame(createGameDto);
    }

    @GetMapping
    public List<GameEntity> getAllGames() {
        return service.getAllGames();
    }

    @PostMapping("/add-player")
    public GameEntity addPlayerToGame(@RequestBody AddPlayerDto addPlayerDto) {
        return service.addPlayerToGame(addPlayerDto);
    }

    @GetMapping("/{playerId}")
    public List<GameInfoDto> getAllGamesByPlayerId(@PathVariable int playerId) {
        return service.getAllGamesByPlayerId(playerId);
    }
}
