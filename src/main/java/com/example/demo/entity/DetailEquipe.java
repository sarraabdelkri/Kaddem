package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class DetailEquipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long salle;
    private String thematique;

    @OneToOne(mappedBy = "detailEquipe")
    private Equipe equipe;
    @Override
    public String toString() {
        return "DetailEquipe{" +
                "salle=" + salle +
                ", thematique='" + thematique + '\'' +
                '}';
    }

    public long getSalle() {
        return salle;
    }

    public void setSalle(long salle) {
        this.salle = salle;
    }

    public String getThematique() {
        return thematique;
    }

    public void setThematique(String thematique) {
        this.thematique = thematique;
    }
}
