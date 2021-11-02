package fr.ToSucceed.entities.Retour;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Commentaire {

    @Id
    private int id_com;
    private Date date_com;
    private String contenu_msg;




}
