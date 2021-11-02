package fr.ToSucceed.dao.Personne;

import fr.ToSucceed.dao.Abonnement.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IEleve extends JpaRepository<fr.ToSucceed.entities.Personne.Eleve,Integer> {
}
