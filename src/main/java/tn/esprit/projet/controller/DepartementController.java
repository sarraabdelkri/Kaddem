package tn.esprit.projet.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet.entities.Departement;
import tn.esprit.projet.services.IDepartementService;
import tn.esprit.projet.services.IUniversiteService;

import java.util.List;
import java.util.Set;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

@AllArgsConstructor
public class DepartementController {

    IDepartementService iDepartementService;
    IUniversiteService iUniversiteService;

    @GetMapping("/getD")
    public List<Departement> GetDep(){

        return  iDepartementService.getAlldep();
    }

    @PostMapping("/addDep")
    public void  addContrat(@RequestBody Departement D){
        iDepartementService.addep(D);
    }


    @PutMapping("/putDep/{idDepart}")
    public void updateC(@PathVariable("idDepart") Long id, @RequestBody Departement C){

        C.setIdDepart(id);
        iDepartementService.updatedep(C);
    }
    @DeleteMapping("/delDep/{idDepart}")
    public  void deleteC(@PathVariable("idDepart") Long id){

        iDepartementService.deletedep(id);
    }
    @GetMapping("/department/{idDepart}")

    public Departement getDepartmentById(@PathVariable("idDepart") Long idDepart) {
        return iDepartementService.getdepbyid(idDepart);
    }


    @GetMapping("/getIDU/{idUni}")
    public Set<Departement> GetDepByIdUni(@PathVariable("idUni") Long ID){

        return  iDepartementService.retrieveDepartementsByUniversite(ID);
    }
    //nombre d'etudiant par department
    @GetMapping("/nbEtudiant/{idDepart}")
    @ResponseBody
    public long getnbrEtudiantByDepart(@PathVariable("idDepart") Long idDepart) {
        return iDepartementService.nbTotalEtudiant(idDepart);
    }
//nombre universite par universite


@PostMapping("/Universite/{idUni}/Departments")
public Departement createDepartment(@PathVariable(value = "idUni") Long idUni,@RequestBody Departement d) {

      return   iDepartementService.createUniver(idUni,d);
    }
    @RequestMapping(value="/univ/{idUni}/depart",method={RequestMethod.DELETE, RequestMethod.GET})
    public ResponseEntity<List<Departement>> deleteAllDepartmentOfUniversite(@PathVariable(value = "idUni") Long idUni)

    {
        return iDepartementService.deleteAllDepartmentOfUniversite(idUni);
    }

    @GetMapping("/universite/{idUni}/departments")
    public ResponseEntity<List<Departement>> getAllDepartmentOfUniversite(@PathVariable(value = "idUniv")  Long idUniv) {


        return iDepartementService.getAllDepartmentOfUniversite(idUniv);
    }

}
