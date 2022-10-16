package com.example.demo.service;



import com.example.demo.entity.DetailEquipe;

import java.util.List;

public interface IDetailEquipeService {
    List<DetailEquipe> getAllDetailEquipe();

    DetailEquipe addDetailEquipe(DetailEquipe detailEquipe);

    DetailEquipe updateDetailEquipe(DetailEquipe updateDetailEquipe);

    void deleteDetailEquipeById(long id);

    DetailEquipe getDetailEquipeById(long id);
}
