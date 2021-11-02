package fr.ToSucceed.entities.Contenu;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor @Getter
@Setter
public class MessageDuJour {

    @Id
    @GeneratedValue(strategy = AUTO)
    private int id;
    private String titre_msg;
    private String contenu_msg;



}
