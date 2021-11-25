package fr.ToSucceed.entities.Personne;

import lombok.*;

import javax.persistence.*;

import java.time.LocalDate;

import static javax.persistence.GenerationType.AUTO;

@Entity
@AllArgsConstructor
@NoArgsConstructor @Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
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
