package com.example.demo.entity;


import javax.persistence.*;
import java.util.List;

enum    Option {
GAMIX,SE,SIM,NIDS}
@Entity
@Table( name = " Etudiant")
public class Etudiant {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Long idEtudiant; // Clé primaire
    private String prenomE;
    private String nomE;
    private Option option;

    @OneToMany(mappedBy = "etudiant")
    private List<Contrat> contrat;

    @ManyToOne
    private Departement departement;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Equipe> equipes;
    public String getPrenomE() {
        return prenomE;
    }
    public void setPrenomE(String prenomE) {
        this.prenomE = prenomE;
    }

    public String getNomE() {
        return nomE;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }

    public Long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "idEtudiant=" + idEtudiant +
                ", prenomE='" + prenomE + '\'' +
                ", nomE='" + nomE + '\'' +
                ", option=" + option +
                '}';
    }
}