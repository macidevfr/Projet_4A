package fr.ToSucceed.dao.Contenu;

import fr.ToSucceed.entities.Contenu.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICours extends JpaRepository<Cours, Integer> {
    Optional<Cours> findCoursById(Integer id);
}
