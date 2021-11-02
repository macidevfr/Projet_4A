package fr.ToSucceed.ressource;

import fr.ToSucceed.entities.Abonnement.Abonnement;
import fr.ToSucceed.entities.Contenu.Cours;
import fr.ToSucceed.service.AbonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("abonnement")
public class AbonnementController {
    private final AbonnementService abonnementService;

    @Autowired
    public AbonnementController(AbonnementService abonnementService) {
        this.abonnementService = abonnementService;
    }

    @GetMapping
    public List<Abonnement> getAbonnements(){
        return abonnementService.getAbonnements();
    }

    @PostMapping
    public void addNewAbonnement(@RequestBody Abonnement abonnement){
        abonnementService.addNewAbonnement(abonnement);
    }

    @DeleteMapping("delete/{id}")
    public void deleteAbonnement(@PathVariable("id")Integer id){
        abonnementService.deleteAbonnement(id);
    }
}
