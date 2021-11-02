package fr.ToSucceed.service;

import fr.ToSucceed.dao.Retour.ICommentaire;
import fr.ToSucceed.entities.Retour.Commentaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentaireService {
    private final ICommentaire iCommentaire;

    @Autowired
    public CommentaireService(ICommentaire iCommentaire) {
        this.iCommentaire = iCommentaire;
    }

    public List<Commentaire> getCommentaires(){
        return iCommentaire.findAll();
    }

    public void addNewCommentaire(Commentaire commentaire){
        Optional<Commentaire> commentaireOptional = iCommentaire.findCommentaireById(commentaire.getId());
        if (commentaireOptional.isPresent()){
            throw new IllegalStateException("ID taken");
        }
        iCommentaire.save(commentaire);
    }

    public void deleteCommentaire(Integer commentaireID){

        boolean exists = iCommentaire.existsById(commentaireID);
        if(!exists){
            throw new IllegalStateException("Commentaire with id "+commentaireID+" does not exist");
        }
        iCommentaire.deleteById(commentaireID);
    }

}
