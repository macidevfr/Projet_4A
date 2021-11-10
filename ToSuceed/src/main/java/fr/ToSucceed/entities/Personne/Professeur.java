package fr.ToSucceed.entities.Personne;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "id")
public class Professeur extends Personne {



}
