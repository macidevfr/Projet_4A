package fr.ToSucceed.dao.Personne;

import fr.ToSucceed.entities.Personne.Personne;
import fr.ToSucceed.entities.Personne.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProfesseur extends JpaRepository<Professeur, Long> {
}
