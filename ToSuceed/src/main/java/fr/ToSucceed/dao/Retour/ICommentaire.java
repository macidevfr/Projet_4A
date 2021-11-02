package fr.ToSucceed.dao.Retour;

import fr.ToSucceed.entities.Personne.Personne;
import fr.ToSucceed.entities.Retour.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICommentaire extends JpaRepository<Commentaire, Integer> {
    Optional<Commentaire> findCommentaireById(Integer integer);
}
