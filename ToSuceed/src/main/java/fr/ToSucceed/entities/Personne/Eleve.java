package fr.ToSucceed.entities.Personne;

import fr.ToSucceed.entities.Abonnement.Abonnement;
import fr.ToSucceed.entities.Contenu.Cours;
import fr.ToSucceed.entities.Retour.Commentaire;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "id")
public class Eleve extends Personne {


   @ManyToOne
    private Abonnement abonnement;

  @OneToMany(mappedBy = "eleve")
   private List<Commentaire> commentaires = new ArrayList<>();

    @ManyToMany(mappedBy = "eleves")
    private List<Cours> cours_visit = new ArrayList<>();

    public List<Cours> getCours_visit() {
        return cours_visit;
    }

    public void setCours_visit(List<Cours> cours_visit) {
        this.cours_visit = cours_visit;
    }
}
