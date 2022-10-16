package com.example.demo.service;

import com.example.demo.entity.Universite;

import java.util.List;

public interface IUniversiteService {


    List<Universite> getAllUniversite();

    Universite addUniversite(Universite universite);

    Universite updateUniversite(Universite updateUniversite);

    void deleteUniversiteById(long id);


    Universite getUniversiteById(long id);
}
