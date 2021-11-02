package fr.ToSucceed.entities.Abonnement;

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
public class Abonnement {

    @Id
    @GeneratedValue(strategy = AUTO)
    private int id;
    private double prix;
    private int duree;



}
