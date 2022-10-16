package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

enum Specialite{
    IA,
    RESEAUX,
    CLOUD,
    SECURITE
}

@Entity

public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idContrat;
    @Temporal (TemporalType.DATE)
    private Date dateDebutContrat;

    @Temporal (TemporalType.DATE)
    private Date dateFinContrat;
    private Specialite specialite;
    private boolean archive;
    @ManyToOne
     private Etudiant etudiant;

    @Override
    public String toString() {
        return "Contrat{" +
                "idContrat=" + idContrat +
                ", dateDebutContrat=" + dateDebutContrat +
                ", dateFinContrat=" + dateFinContrat +
                ", specialite=" + specialite +
                ", archive=" + archive +
                '}';
    }

    public int getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(int idContrat) {
        this.idContrat = idContrat;
    }

    public Date getDateDebutContrat() {
        return dateDebutContrat;
    }

    public void setDateDebutContrat(Date dateDebutContrat) {
        this.dateDebutContrat = dateDebutContrat;
    }

    public Date getDateFinContrat() {
        return dateFinContrat;
    }

    public void setDateFinContrat(Date dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
    }

    @Enumerated(EnumType.STRING)
    public Specialite getSpecialite() {
        return specialite;
    }


    @Enumerated(EnumType.STRING)
    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }

    public boolean isArchive() {
        return archive;
    }

    public void setArchive(boolean archive) {
        this.archive = archive;
    }
}
