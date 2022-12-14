package tn.esprit.projet.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.projet.entities.Departement;
import tn.esprit.projet.entities.Universite;
import tn.esprit.projet.repository.DepartementRepository;
import tn.esprit.projet.repository.UniversiteRepository;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class UniversiteServiceIMPL implements  IUniversiteService {


    UniversiteRepository universiteRepository;
    DepartementRepository departementRepository;

    @Override
    public List<Universite> getAllUniv() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniv(Universite U) {
        return universiteRepository.save(U);
    }

    @Override
    public Universite updateUni(Universite U) {
        return universiteRepository.save(U);
    }

    @Override
    public void deleteUni(long id) {
        universiteRepository.deleteById(id);

    }

    @Override
    public Universite getUnid(long id) {
        return universiteRepository.findById(id).orElse(null);
    }

    @Override
    public void assignDepartToUni(Long idU, Long dep) {
        Universite universite = universiteRepository.findById(idU).orElse(null);
        Departement departement = departementRepository.findById(dep).orElse(null);
        universite.getDepartement().add(departement);
        universiteRepository.save(universite);


    }


//nombre  totale department by iduniv
    @Override
    public long nbTotalDepartment(Long idUni) {
        Long nbT;
        Universite universite=universiteRepository.findById(idUni).orElse(null);
        nbT=universite.getDepartement().stream().count();
        return nbT;
    }





   /* @Override
    public List nbTotalDepartmentbynom(String nomUni) {
       List nomdepart=new ArrayList<>();
       Universite universite=universiteRepository.findByNomUni(nomUni);
       nomdepart= universite.getDepartement().add();
        return nomdepart;
    }

*/
}
