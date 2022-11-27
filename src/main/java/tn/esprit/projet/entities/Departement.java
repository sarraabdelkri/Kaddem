package tn.esprit.projet.entities;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Departement")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@ToString
public class Departement   implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idDepart")
    private Long idDepart; // Clé primaire
    private String nomDepart;
    private String code;
    private String type;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "departement")
    private Set<Etudiant> etudiants;

}
