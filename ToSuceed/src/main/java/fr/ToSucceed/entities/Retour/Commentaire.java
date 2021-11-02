package fr.ToSucceed.entities.Retour;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Commentaire {

    @Id
    @GeneratedValue(strategy = AUTO)
    private int id_com;
    private Date date_com;
    private String contenu_msg;




}
