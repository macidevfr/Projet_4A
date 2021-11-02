package fr.ToSucceed.entities.Personne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
    private LocalDate dob;
    private LocalDate doi;


}
