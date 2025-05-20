package com.devsuperior.dslist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.service.GameService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping
public class GameController {

    @Autowired
    private GameService gs;

    @GetMapping("/games")
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gs.findAll();
        return result;
    }

}
