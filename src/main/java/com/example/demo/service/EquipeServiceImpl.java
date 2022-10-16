package com.example.demo.service;

import com.example.demo.entity.Equipe;
import com.example.demo.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EquipeServiceImpl implements  IEquipeService{

   @Autowired
    EquipeRepository equipeRepository;
    @Override
    public List<Equipe> getAllEquipe() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public Equipe updateEquipe(Equipe updateEquipe) {
        return equipeRepository.save(updateEquipe);
    }

    @Override
    public void deleteEquipeById(long id) {equipeRepository.deleteById(id);

    }

    @Override
    public Equipe getEquipeById(long id) {
        return equipeRepository.findById(id).orElse(null);
    }
}
