package fr.ToSucceed.entities.Abonnement;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Abonnement {

    @Id
    private int id_abo;
    private double prix;
    private int duree;



}
