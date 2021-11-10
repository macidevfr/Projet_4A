package fr.ToSucceed.entities.Personne;

import fr.ToSucceed.entities.Abonnement.Abonnement;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@NoArgsConstructor
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "id")
public class Eleve extends Personne {


   @ManyToOne
    private Abonnement abonnement;

}
