package com.example.demo.service;


import com.example.demo.entity.Departement;

import java.util.List;

public interface IDepartmentSevice {
    List<Departement> getAllDepartement();

    Departement addContrat(Departement departement);

    Departement updateDepartement(Departement updateDepartement);

    void deleteDepartementById(long id);

    Departement getDepartementById(long id);

}
