package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idDepart;
    private String nomUniv;

    @OneToMany
    List<Departement> departements;
    @Override
    public String toString() {
        return "Universite{" +
                "idDepart=" + idDepart +
                ", nomUniv='" + nomUniv + '\'' +
                '}';
    }

    public int getIdDepart() {
        return idDepart;
    }

    public void setIdDepart(int idDepart) {
        this.idDepart = idDepart;
    }

    public String getNomUniv() {
        return nomUniv;
    }

    public void setNomUniv(String nomUniv) {
        this.nomUniv = nomUniv;
    }
}
