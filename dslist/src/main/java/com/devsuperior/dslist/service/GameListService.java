package com.devsuperior.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repository.GameListRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository glr;

    public List<GameListDTO> findAll() {
        List<GameList> result = glr.findAll();
        List<GameListDTO> listdto = result.stream().map(x -> new GameListDTO(x)).toList();
        return listdto;
    }

    public List<GameMinDTO> findByGameList(Long listId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByGameList'");
    }
}
