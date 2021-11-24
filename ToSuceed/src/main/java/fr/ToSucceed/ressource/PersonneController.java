package fr.ToSucceed.ressource;

import fr.ToSucceed.entities.Personne.Personne;
import fr.ToSucceed.service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "personne")

public class PersonneController {
    private final PersonneService personneService;

    @Autowired

    public PersonneController(PersonneService personneService) {
        this.personneService = personneService;
    }

    @GetMapping
    public List<Personne> getPersonnes(){
        return personneService.getPersonnes();
    }

    @PostMapping(path = "save")
    public void addNewPersonne(@RequestBody Personne personne){
        personneService.addNewPersonne(personne);
    }

    @DeleteMapping("delete/{id}")
    public void deletePersonne(@PathVariable("id")Long id){
        personneService.deletePersonne(id);
    }

}
