package com.example.demo.service;

import com.example.demo.entity.Contrat;
import com.example.demo.repository.ContratRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContratServiceImpl implements IContratService{

    @Autowired
    ContratRepository contratRepository;
    @Override
    public List<Contrat> getAllContrat() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat addContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat updateContrat(Contrat updateContrat) {
        return contratRepository.save(updateContrat);
    }

    @Override
    public void deleteContratById(long id) { contratRepository.deleteById(id);}

    @Override
    public Contrat getContratById(long id) {
        return contratRepository.findById(id).orElse(null);
    }
}
