package com.example.demo.service;

import com.example.demo.entity.Etudiant;
import com.example.demo.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class
EtudiantServiceImpl implements  IEtudiantService{
    @Autowired
    EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> getAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant updateEtudiant) {
        return etudiantRepository.save(updateEtudiant);
    }

    @Override
    public void deleteEtudiantById(long id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public Etudiant getEtudiantById(long id) {
       return etudiantRepository.findById(id).orElse(null);
    }
}
