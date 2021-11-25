package fr.ToSucceed.entities.Contenu;


import fr.ToSucceed.entities.Personne.Eleve;
import fr.ToSucceed.entities.Personne.Professeur;
import fr.ToSucceed.entities.Retour.Commentaire;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter

public class Cours {
    @Id
    @GeneratedValue(strategy = AUTO)
    private int id;
    private String niveau;
    private String nom;
    private String description;
    private LocalDate dop;
    private String matiere;
    @Enumerated(EnumType.STRING)
    private CoursType type;


    public Cours(int id, String niveau, String nom, String description, LocalDate dop, String matiere, CoursType type) {
        this.id = id;
        this.niveau = niveau;
        this.nom = nom;
        this.description = description;
        this.dop = dop;
        this.matiere = matiere;
        this.type = type;
    }

    @ManyToMany (mappedBy = "cours")
    private List<Professeur> profs = new ArrayList<>();

    @ManyToMany
    private List<Eleve> eleves = new ArrayList<>();

    @OneToMany(mappedBy = "cours")
    private List<Commentaire> commentaires = new ArrayList<>();

    public List<Professeur> getProfs() {
        return profs;
    }

    public void setProfs(List<Professeur> profs) {
        this.profs = profs;
    }




}
