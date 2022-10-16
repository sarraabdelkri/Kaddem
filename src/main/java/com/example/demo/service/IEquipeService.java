package com.example.demo.service;

import com.example.demo.entity.Equipe;

import java.util.List;

public interface IEquipeService {
    List<Equipe> getAllEquipe();
    Equipe addEquipe(Equipe equipe);
    Equipe updateEquipe(Equipe updateEquipe);
    void deleteEquipeById(long id);
    Equipe getEquipeById(long id);
}


