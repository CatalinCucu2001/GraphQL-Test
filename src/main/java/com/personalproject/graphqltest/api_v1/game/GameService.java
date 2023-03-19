package com.personalproject.graphqltest.api_v1.game;

import com.personalproject.graphqltest.api_v1.game.dto.AddPlayerDto;
import com.personalproject.graphqltest.api_v1.game.dto.CreateGameDto;
import com.personalproject.graphqltest.api_v1.game.dto.GameInfoDto;
import com.personalproject.graphqltest.api_v1.player.PlayerService;
import com.personalproject.graphqltest.entity.GameEntity;
import com.personalproject.graphqltest.utils.mapper.GameMapper;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class GameService {
    private final GameRepository repository;
    private final PlayerService playerService;
    private final GameMapper mapper = Mappers.getMapper(GameMapper.class);
    public GameEntity createGame(CreateGameDto createGameDto) {
        return repository.save(mapper.createGameDtoToGameEntity(createGameDto));
    }

    public List<GameEntity> getAllGames() {
        return StreamSupport.stream(repository.findAll().spliterator(), false).toList();
    }

    public GameEntity addPlayerToGame(AddPlayerDto addPlayerDto) {
        var game = repository.findById(addPlayerDto.getGameId()).orElseThrow(() -> new IllegalArgumentException("Game not found!"));
        game.getPlayers().add(playerService.getPlayerById(addPlayerDto.getPlayerId()));
        return repository.save(game);
    }

    public List<GameInfoDto> getAllGamesByPlayerId(int playerId) {
        return mapper.GameEntityListToGameInfoDtoList(repository.getAllByPlayerId(playerId));
    }
}
