package fr.ToSucceed.entities.Abonnement;

import fr.ToSucceed.entities.Personne.Eleve;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor @Getter
@Setter
public class Abonnement {

    @Id
    @GeneratedValue(strategy = AUTO)
    private int id;
    private double prix;
    private int duree;
    private String titre;

    public Abonnement(int id, double prix, int duree, String titre) {
        this.id = id;
        this.prix = prix;
        this.duree = duree;
        this.titre = titre;
    }



    @OneToMany(mappedBy = "abonnement")
    private List<Eleve> eleve = new ArrayList<>();

    public List<Eleve> getEleve() {
        return eleve;
    }

    public void setEleve(List<Eleve> eleve) {
        this.eleve = eleve;
    }
}
