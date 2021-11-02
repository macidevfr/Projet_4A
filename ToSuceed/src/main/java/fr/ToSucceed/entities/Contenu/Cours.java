package fr.ToSucceed.entities.Contenu;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cours {
    @Id
    @GeneratedValue(strategy = AUTO)
    private int id_cours;
    private String niveau;
    private String nom;
    private String description;
    private Date dop;
    private String matiere;

}
