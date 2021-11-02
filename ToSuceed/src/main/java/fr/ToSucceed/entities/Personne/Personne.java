package fr.ToSucceed.entities.Personne;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.time.LocalDate;
import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor @Getter
@Setter
public class Personne {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id_personne;
    private String login;
    private String password;
    private String nom;
    private String prenom;
    private String mail;
    private boolean admin;
    private boolean accesPlateforme;
    private LocalDate dob;
    private LocalDate doi;


}
