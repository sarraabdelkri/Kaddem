package tn.esprit.projet.services;

import tn.esprit.projet.entities.*;

import java.util.List;
import java.util.Set;

public interface IUniversiteService {

    List<Universite> getAllUniv();
    Universite addUniv(Universite U);
    Universite updateUni(Universite U);
    void deleteUni(long id);
    Universite getUnid(long id);
    public void assignDepartToUni(Long idU,Long dep);
    long nbTotalDepartment(Long idUni);
    //List nbTotalDepartmentbynom(String nomUni);
    //List<Universite> getUniversitebyNomDepart( Long idDepart);
    ///Set<Universite> getUniversitesByDepartement (Long idDepartement);
}
