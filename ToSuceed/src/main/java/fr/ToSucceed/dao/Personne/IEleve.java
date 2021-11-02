package fr.ToSucceed.dao.Personne;

import fr.ToSucceed.entities.Personne.Eleve;
import fr.ToSucceed.entities.Personne.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEleve extends JpaRepository<Eleve, Long> {
}
