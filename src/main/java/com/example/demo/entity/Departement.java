package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nomDepart;

    @OneToMany(mappedBy = "departement")
    private List<Etudiant> etudiants;


    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepart='" + nomDepart + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepart() {
        return nomDepart;
    }

    public void setNomDepart(String nomDepart) {
        this.nomDepart = nomDepart;
    }
}
