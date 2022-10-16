package com.example.demo.service;

import com.example.demo.entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant> getAllEtudiant();
    Etudiant addEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant updateEtudiant);
    void deleteEtudiantById(long id);
    Etudiant getEtudiantById(long id);
}
