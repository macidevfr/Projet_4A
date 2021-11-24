package fr.ToSucceed;


import fr.ToSucceed.dao.Abonnement.IAbonnement;
import fr.ToSucceed.dao.Contenu.ICours;
import fr.ToSucceed.dao.Contenu.IMessageDuJour;
import fr.ToSucceed.dao.Personne.IAdministrateur;
import fr.ToSucceed.dao.Personne.IEleve;
import fr.ToSucceed.dao.Personne.IProfesseur;
import fr.ToSucceed.dao.Retour.ICommentaire;
import fr.ToSucceed.entities.Abonnement.Abonnement;
import fr.ToSucceed.entities.Contenu.Cours;
import fr.ToSucceed.entities.Contenu.CoursType;
import fr.ToSucceed.entities.Contenu.MessageDuJour;
import fr.ToSucceed.entities.Personne.Administrateur;
import fr.ToSucceed.entities.Personne.Eleve;
import fr.ToSucceed.entities.Personne.Personne;
import fr.ToSucceed.dao.Personne.IPersonne;
import fr.ToSucceed.entities.Personne.Professeur;
import fr.ToSucceed.entities.Retour.Commentaire;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ToSuceedApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToSuceedApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(IAbonnement iAbonnement,
                             ICommentaire iCommentaire ,
                             IAdministrateur iAdministrateur,
                             IEleve iEleve,
                             IPersonne iPersonne,
                             IProfesseur iProfesseur,
                             ICours iCours,
                             IMessageDuJour iMessageDuJour){
        return args -> {


            Personne Mael = new Personne(null,"eleve1","eleve1","mael","cipriani","maelcipriani@gmail.com",true,true, LocalDate.of(2001, Month.JULY, 16),LocalDate.of(2021, Month.NOVEMBER, 02));
            Personne Youssef = new Personne(null,"eleve2","eleve2","youssef","iffri","youssefiffri@gmail.com",true,true, LocalDate.of(2000, Month.MARCH, 23),LocalDate.of(2021, Month.NOVEMBER, 02));
            Personne Wilfried = new Personne(null,"eleve3","eleve3","wilfried","sanon","wilfriedsanon@gmail.com",true,true, LocalDate.of(2000, Month.DECEMBER, 8),LocalDate.of(2021, Month.NOVEMBER, 02));
            Abonnement abo  = new Abonnement(1,500,365,"Annuel");
            Commentaire com = new Commentaire(2,LocalDate.of(2001, Month.JULY, 16),"Premier essaie de commentaire");
            Cours math = new Cours(2,"6eme","Conique pour débutant","Prix du meilleur Cours 2021",LocalDate.of(2001, Month.JULY, 16),"Mathematiques",CoursType.PDF );
            MessageDuJour mess = new MessageDuJour(2,"Hello World !","Bienvenu sur ToSuceed");

            Professeur Youcef = new Professeur();
            Youcef.setLogin("yc1");
            Youcef.setAccesPlateforme(true);
            Youcef.setId_personne(5L);
            Youcef.setDob(LocalDate.of(1980, Month.AUGUST, 16));
            Youcef.setDoi(LocalDate.of(2021, Month.AUGUST, 20));

            Eleve ELLL = new Eleve();
            ELLL.setLogin("el01");
            ELLL.setAccesPlateforme(true);
            ELLL.setDob(LocalDate.of(2000, Month.JANUARY, 19));
            ELLL.setDoi(LocalDate.of(1980, Month.AUGUST, 16));

//            List<Eleve> stds = new ArrayList<>();
//            stds.add(ELLL);
//            abo.setEleve(stds);
//            com.setCours(math);
//            com.setEleve(ELLL);




            iProfesseur.save(Youcef);
            iEleve.save(ELLL);
            iPersonne.save(Mael);
            iPersonne.save(Youssef);
            iPersonne.save(Wilfried);
            iAbonnement.save(abo);
            iCommentaire.save(com);
            iCours.save(math);
            iMessageDuJour.save(mess);


        };
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
        corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-AlLow-Origin", "Content-Type",
                "Accept", "Jwt-Token", "Authorization", "Origin, Accept", "X-Requested-With",
                "Access-Control-Request-Method", "Access-Control-Request-Headers"));
        corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Jwt-Token", "Authorization",
                "Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials", "Filename"));
        corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }

}
