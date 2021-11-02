package fr.ToSucceed.entities.Contenu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageDuJour {

    @Id
    @GeneratedValue(strategy = AUTO)
    private int id_msg;
    private String titre_msg;
    private String contenu_msg;



}
