package fr.ToSucceed.entities.Personne;

import fr.ToSucceed.entities.Contenu.Cours;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "id")
public class Professeur extends Personne {


    @ManyToMany
    @JoinColumn(name = "prfcours")
    private List<Cours> cours = new ArrayList<>();

}
