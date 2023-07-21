package com.elbiasimonebuglio.dslist.dto;

import com.elbiasimonebuglio.dslist.entities.GameList;

public class GameListDTO {

    private Long id;
    private String nome;

    public GameListDTO(){

    }

    public GameListDTO(GameList entity) {
        id = entity.getId();
        nome = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
