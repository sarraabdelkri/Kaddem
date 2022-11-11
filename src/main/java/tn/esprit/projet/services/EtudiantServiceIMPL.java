package tn.esprit.projet.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.projet.entities.Departement;
import tn.esprit.projet.entities.Equipe;
import tn.esprit.projet.entities.Etudiant;
import tn.esprit.projet.entities.Option;
import tn.esprit.projet.repository.DepartementRepository;
import tn.esprit.projet.repository.EtudiantRepository;
import java.util.List;


@Service
@AllArgsConstructor
public class EtudiantServiceIMPL implements IEtudiantService{

    EtudiantRepository etudiantRepository;
    DepartementRepository departementRepository;
    @Override
    public List<Etudiant> getAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant E) {
        return etudiantRepository.save(E);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant E) {
        return etudiantRepository.save(E);
    }

    @Override
    public void deleteEtudiant(long id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public Etudiant getEtudiantbyid(long id) {

        return etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public Etudiant findEtudiantByprenom(String prenom) {
        return etudiantRepository.findEtudiantByprenom(prenom);
    }

    @Override
    public void updateEtudiantByOption(Option op, Long idEtudiant) {
        etudiantRepository.updateEtudiantByOption(op,idEtudiant);
    }

    @Override
    public List<Etudiant> retrieveEtudiantByEquipeThematique(String thematique) {
       return etudiantRepository.retrieveEtudiantByEquipeThematique(thematique);
    }

    @Override
    public void AssignEtudtoDepartement(Long idEtudiant, Long idDepart) {
        Etudiant etd=etudiantRepository.findById(idEtudiant).orElse(null);
        Departement dep=departementRepository.findById(idDepart).orElse(null);
        etd.setDepartement(dep);
        etudiantRepository.save(etd);
    }


}
