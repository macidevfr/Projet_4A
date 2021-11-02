package fr.ToSucceed.ressource;

import fr.ToSucceed.entities.Contenu.MessageDuJour;
import fr.ToSucceed.entities.Retour.Commentaire;
import fr.ToSucceed.service.CommentaireService;
import fr.ToSucceed.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("commentaire")
public class CommentaireController {
    private CommentaireService commentaireService;

    @Autowired
    public CommentaireController(CommentaireService commentaireService) {
        this.commentaireService = commentaireService;
    }

    @GetMapping
    public List<Commentaire> getCommentaires(){return commentaireService.getCommentaires();}

    @PostMapping
    public void addNewCommentaire(@RequestBody Commentaire commentaire){
        commentaireService.addNewCommentaire(commentaire);
    }

    @DeleteMapping("delete/{id}")
    public void deleteCommentaire(@PathVariable("id")Integer id){
        commentaireService.deleteCommentaire(id);
    }
}
