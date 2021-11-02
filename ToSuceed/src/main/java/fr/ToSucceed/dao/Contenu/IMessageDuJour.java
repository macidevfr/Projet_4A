package fr.ToSucceed.dao.Contenu;

import fr.ToSucceed.entities.Contenu.MessageDuJour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IMessageDuJour extends JpaRepository<MessageDuJour, Integer> {
    Optional<MessageDuJour> findMessageDuJourById(Integer id);
}
