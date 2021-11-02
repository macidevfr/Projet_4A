package fr.ToSucceed.entities.Abonnement;

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
public class Abonnement {

    @Id
    @GeneratedValue(strategy = AUTO)
    private int id_abo;
    private double prix;
    private int duree;



}
