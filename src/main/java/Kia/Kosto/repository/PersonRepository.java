package Kia.Kosto.repository;


import java.util.Optional;
import org.springframework.data.repository.Repository;

import Kia.Kosto.model.Person;

public interface PersonRepository extends Repository<Person, Long> {
    Person save(Person person);
    Optional<Person> findById(long id);
}
