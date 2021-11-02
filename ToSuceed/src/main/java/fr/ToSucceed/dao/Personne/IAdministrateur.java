package fr.ToSucceed.dao.Personne;

import fr.ToSucceed.entities.Personne.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdministrateur extends JpaRepository<Administrateur, Long> {

}
