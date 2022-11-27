package tn.esprit.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tn.esprit.projet.entities.Departement;
import tn.esprit.projet.entities.Universite;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
Universite findUniversiteByNomUni(String nomUniv);
}
