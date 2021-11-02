package fr.ToSucceed.dao.Retour;

import fr.ToSucceed.dao.Abonnement.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ICommentaire extends JpaRepository<fr.ToSucceed.entities.Retour.Commentaire,Integer> {
}
