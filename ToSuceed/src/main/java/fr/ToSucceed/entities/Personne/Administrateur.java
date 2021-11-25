package fr.ToSucceed.entities.Personne;

import fr.ToSucceed.entities.Contenu.MessageDuJour;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "id")
public class Administrateur extends Personne {

    @OneToMany
    private List<MessageDuJour> msg = new ArrayList<>();
}
