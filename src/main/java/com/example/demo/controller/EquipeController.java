package com.example.demo.controller;

import com.example.demo.entity.Equipe;
import com.example.demo.entity.Etudiant;
import com.example.demo.service.IEquipeService;
import com.example.demo.service.IEtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("equipe")
public class EquipeController {


    @Autowired
    IEquipeService equipeService;

    @GetMapping
    public List<Equipe> getEquipe(){return equipeService.getAllEquipe();
    }

    @PostMapping("/equipe/add" )
    @ResponseStatus(HttpStatus.CREATED)
    public Equipe createEquipe(@RequestBody Equipe equipe){
        return equipeService.addEquipe(equipe);
    }


}
