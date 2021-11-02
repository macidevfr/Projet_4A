package fr.ToSucceed.entities.Retour;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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




}
