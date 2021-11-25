package fr.ToSucceed.entities.Retour;

import fr.ToSucceed.entities.Contenu.Cours;
import fr.ToSucceed.entities.Personne.Eleve;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Commentaire {

    @Id
    @GeneratedValue(strategy = AUTO)
    private int id;
    private LocalDate date_com;
    private String contenu_msg;

    public Commentaire(int id, LocalDate date_com, String contenu_msg) {
        this.id = id;
        this.date_com = date_com;
        this.contenu_msg = contenu_msg;
    }


    @ManyToOne
    private Eleve eleve;

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    @ManyToOne
    private Cours cours;




}
