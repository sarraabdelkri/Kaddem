package com.example.demo.service;

import com.example.demo.entity.Departement;
import com.example.demo.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements IDepartmentSevice{

    @Autowired
    DepartementRepository departementRepository;
    @Override
    public List<Departement> getAllDepartement() {
        return departementRepository.findAll();
    }

    @Override
    public Departement addContrat(Departement departement) {
        return departementRepository.save(departement);
    }

    @Override
    public Departement updateDepartement(Departement updateDepartement) {
        return departementRepository.save(updateDepartement);
    }

    @Override
    public void deleteDepartementById(long id) {departementRepository.deleteById((int) id);}


    @Override
    public Departement getDepartementById(long id) {
        return departementRepository.findById((int) id).orElse(null);
    }
}
