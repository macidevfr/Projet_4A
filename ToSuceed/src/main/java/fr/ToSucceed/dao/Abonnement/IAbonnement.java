package fr.ToSucceed.dao.Abonnement;

import fr.ToSucceed.entities.Abonnement.Abonnement;
import fr.ToSucceed.entities.Personne.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IAbonnement extends JpaRepository<Abonnement, Integer> {
    Optional<Abonnement> findAbonnementById(Integer integer);
}
