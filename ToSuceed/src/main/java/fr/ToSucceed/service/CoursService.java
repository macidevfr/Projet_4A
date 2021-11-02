package fr.ToSucceed.service;

import fr.ToSucceed.dao.Contenu.ICours;
import fr.ToSucceed.entities.Contenu.Cours;
import fr.ToSucceed.entities.Retour.Commentaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoursService {
    private final ICours iCours;

    @Autowired
    public CoursService(ICours iCours) {
        this.iCours = iCours;
    }

    public List<Cours> getCours(){
        return iCours.findAll();
    }

    public void addNewCours(Cours cours){
        Optional<Cours> coursOptional = iCours.findCoursById(cours.getId());
        if (coursOptional.isPresent()){
            throw new IllegalStateException("ID taken");
        }
        iCours.save(cours);
    }

    public void deleteCours(Integer coursID){

        boolean exists = iCours.existsById(coursID);
        if(!exists){
            throw new IllegalStateException("Cours with id "+coursID+" does not exist");
        }
        iCours.deleteById(coursID);
    }
}
