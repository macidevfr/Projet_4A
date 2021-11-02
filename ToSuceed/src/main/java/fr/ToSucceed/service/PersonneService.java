package fr.ToSucceed.service;


import fr.ToSucceed.entities.Personne.Personne;
import fr.ToSucceed.dao.Personne.PersonneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonneService {
    private final PersonneRepo personneRepo;

    @Autowired
    public PersonneService(PersonneRepo personneRepo) {
        this.personneRepo = personneRepo;
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

    public void deletePersonne(Long studentId){

        boolean exists = personneRepo.existsById(studentId);
        if(!exists){
            throw new IllegalStateException("student with id "+studentId+" does not exist");
        }
        personneRepo.deleteById(studentId);
    }
}
