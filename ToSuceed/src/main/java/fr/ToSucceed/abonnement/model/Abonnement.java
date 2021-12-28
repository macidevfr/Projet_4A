package fr.ToSucceed.abonnement.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Abonnement {

    @Id
    @GeneratedValue(strategy = AUTO)
    private int id;
    private double prix;
    private int duree;
    private String titre;





}
