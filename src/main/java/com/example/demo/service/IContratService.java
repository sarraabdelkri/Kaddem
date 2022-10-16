package com.example.demo.service;

import com.example.demo.entity.Contrat;


import java.util.List;

public interface IContratService {
    List<Contrat> getAllContrat();

    Contrat addContrat(Contrat contrat);

    Contrat updateContrat(Contrat updateContrat);

    void deleteContratById(long id);

    Contrat getContratById(long id);

}
