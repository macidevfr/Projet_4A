package fr.ToSucceed.entities.Contenu;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Cours {
    @Id
    private int id_cours;
    private String niveau;
    private String nom;
    private String description;
    private Date dop;
    private String matiere;

}
