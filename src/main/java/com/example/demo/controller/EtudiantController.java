package com.example.demo.controller;


import com.example.demo.entity.Etudiant;
import com.example.demo.service.IEtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class EtudiantController {
    @Autowired
    IEtudiantService etudiantService;



   @GetMapping
    public List<Etudiant> getEtudiants(){
     return etudiantService.getAllEtudiant();
    }

    @PostMapping("/")
    public Etudiant createEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.addEtudiant(etudiant);
    }

 /*   @PutMapping
    public Etudiant updateEtudiant(Etudiant updateEtudiant){
        return etudiantService.updateEtudiant(updateEtudiant);
    }
    @DeleteMapping
    public void deleteEtudiant(@PathVariable("id") long id){
         etudiantService.deleteEtudiantById(id);
    }
    @GetMapping
    public Etudiant getEtudiantById(long id){
        return etudiantService.getEtudiantById(id);
    } */
}
