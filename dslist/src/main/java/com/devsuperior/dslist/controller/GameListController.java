package com.devsuperior.dslist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.service.GameListService;
import com.devsuperior.dslist.service.GameService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping
public class GameListController {

    @Autowired
    private GameListService gls;

    @Autowired
    private GameService gs;

    @GetMapping("/lists")
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gls.findAll();
        return result;
    }

    @GetMapping("/lists/2/games")
    public List<GameMinDTO> findGames(@PathVariable Long listId) {
        List<GameMinDTO> result = gs.findByGameList(listId);
        return result;
    }

}
