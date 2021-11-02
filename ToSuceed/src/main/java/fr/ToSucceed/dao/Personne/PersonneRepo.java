package fr.ToSucceed.dao.Personne;

import fr.ToSucceed.entities.Personne.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonneRepo extends JpaRepository<Personne, Long> {
    Optional<Personne> findPersonneByLogin(String login);

}
