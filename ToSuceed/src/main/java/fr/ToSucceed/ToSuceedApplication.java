package fr.ToSucceed;


import fr.ToSucceed.dao.Contenu.ICours;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ToSuceedApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToSuceedApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ICours icours){
        return args -> {

        };
    }

}
