package fr.ToSucceed.dao.Contenu;

import fr.ToSucceed.dao.Abonnement.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MessageDuJour extends JpaRepository<fr.ToSucceed.entities.Contenu.MessageDuJour,Integer> {
}
