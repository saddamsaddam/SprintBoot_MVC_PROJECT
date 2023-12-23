package Kia.Kosto.confiq;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import Kia.Kosto.model.Person;
import Kia.Kosto.repository.PersonRepository;
import Kia.Kosto.repository.RegistrationRepository;

@Configuration
@EnableTransactionManagement
public class KostoConfig {

    @Bean
    public CommandLineRunner runner(PersonRepository repository1,RegistrationRepository repository2) {
        return args -> {
            // Commenting out the code to save a Person during startup
            // Person person = new Person("sadik");
            // person.setName("John de");
            // repository.save(person);

            // Log message without saving
            System.out.println("Application started without saving any person info.");
        };
    }
    
   
}
