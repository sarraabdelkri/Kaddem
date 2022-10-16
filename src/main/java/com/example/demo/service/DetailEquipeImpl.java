package com.example.demo.service;

import com.example.demo.entity.DetailEquipe;
import com.example.demo.repository.DetailEquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DetailEquipeImpl implements IDetailEquipeService{
    @Autowired
    DetailEquipeRepository detailEquipeRepository;
    @Override
    public List<DetailEquipe> getAllDetailEquipe() {
       return detailEquipeRepository.findAll();
    }

    @Override
    public DetailEquipe addDetailEquipe(DetailEquipe detailEquipe) {
        return detailEquipeRepository.save(detailEquipe);
    }

    @Override
    public DetailEquipe updateDetailEquipe(DetailEquipe updateDetailEquipe) {
        return detailEquipeRepository.save(updateDetailEquipe);
    }

    @Override
    public void deleteDetailEquipeById(long id) {
                detailEquipeRepository.deleteById(id);
    }

    @Override
    public DetailEquipe getDetailEquipeById(long id) {
        return  detailEquipeRepository.findById(id).orElse(null);
    }
}
