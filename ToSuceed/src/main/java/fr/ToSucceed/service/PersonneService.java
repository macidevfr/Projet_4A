package fr.ToSucceed.service;


import fr.ToSucceed.entities.Personne.Personne;
import fr.ToSucceed.dao.Personne.IPersonne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonneService {
    private final IPersonne personneRepo;

    @Autowired
    public PersonneService(IPersonne IPersonne) {
        this.personneRepo = IPersonne;
    }

    public List<Personne> getPersonnes() {
        return personneRepo.findAll();

    }

    public void addNewPersonne(Personne personne) {
        Optional<Personne> personneOptional = personneRepo.findPersonneByLogin(personne.getLogin());
        if (personneOptional.isPresent()){
            throw new IllegalStateException("Login taken");
        }
        personneRepo.save(personne);
    }

    public void deletePersonne(Long personId){

        boolean exists = personneRepo.existsById(personId);
        if(!exists){
            throw new IllegalStateException("student with id "+personId+" does not exist");
        }
        personneRepo.deleteById(personId);
    }
}
