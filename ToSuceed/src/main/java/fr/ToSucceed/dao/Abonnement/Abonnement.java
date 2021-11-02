package fr.ToSucceed.dao.Abonnement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Abonnement extends JpaRepository<fr.ToSucceed.entities.Abonnement.Abonnement,Integer> {

}
