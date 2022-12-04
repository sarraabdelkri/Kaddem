package tn.esprit.projet.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table( name = "Universite")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Universite   implements Serializable{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idUni")
    private Long idUni; // Clé primaire
    private String nomUni;
    private  String  adresse;
    private String description;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "universites")
    private Set<Departement> departement;



    public void removeDepartments() {
        this.departement.clear();
    }


}
