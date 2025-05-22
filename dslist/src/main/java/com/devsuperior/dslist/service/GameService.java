package com.devsuperior.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;
import com.devsuperior.dslist.repository.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gr;

    public GameDTO findById(@PathVariable Long listId) {
        Game result = gr.findById(listId).get();
        return new GameDTO(result);
    }

    public List<GameMinDTO> findAll() {
        List<Game> result = gr.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }

    public List<GameMinDTO> findByGameList(Long listId) {
        List<GameMinProjection> games = gr.searchByList(listId);
        return games.stream().map(GameMinDTO::new).toList();
    }
}
