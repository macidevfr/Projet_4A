package fr.ToSucceed.ressource;

import fr.ToSucceed.entities.Contenu.Cours;
import fr.ToSucceed.entities.Personne.Personne;
import fr.ToSucceed.service.CoursService;
import fr.ToSucceed.service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cours")
public class CoursController {
    private final CoursService coursService;
    @Autowired
    public CoursController(CoursService coursService) {
        this.coursService = coursService;
    }

    @GetMapping
    public List<Cours> getCours(){
        return coursService.getCours();
    }

    @PostMapping
    public void addNewPersonne(@RequestBody Cours cours){
        coursService.addNewCours(cours);
    }

    @DeleteMapping("delete/{id}")
    public void deleteCours(@PathVariable("id")Integer id){
        coursService.deleteCours(id);
    }
}
