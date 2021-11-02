package fr.ToSucceed.entities.Contenu;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter

public class Cours {
    @Id
    @GeneratedValue(strategy = AUTO)
    private int id;
    private String niveau;
    private String nom;
    private String description;
    private LocalDate dop;
    private String matiere;
    @Enumerated(EnumType.STRING)
    private CoursType type;

}
