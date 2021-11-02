package fr.ToSucceed;


import fr.ToSucceed.entities.Personne.Personne;
import fr.ToSucceed.dao.Personne.PersonneRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class ToSuceedApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToSuceedApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(PersonneRepo personneRepo){
        return args -> {
            Personne Mael = new Personne(null,"eleve1","eleve1","mael","cipriani","maelcipriani@gmail.com",true, LocalDate.of(2001, Month.JULY, 16),LocalDate.of(2021, Month.NOVEMBER, 02));
            Personne Youssef = new Personne(null,"eleve2","eleve2","youssef","iffri","youssefiffri@gmail.com",true, LocalDate.of(2000, Month.MARCH, 23),LocalDate.of(2021, Month.NOVEMBER, 02));
            Personne Wilfried = new Personne(null,"eleve3","eleve3","wilfried","sanon","wilfriedsanon@gmail.com",true, LocalDate.of(2000, Month.DECEMBER, 8),LocalDate.of(2021, Month.NOVEMBER, 02));

            personneRepo.saveAll(List.of(Mael,Youssef,Wilfried));

        };
    }

}
