package fr.ToSucceed.entities.Personne;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@NoArgsConstructor
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "id")
public class Administrateur extends Personne {
}
