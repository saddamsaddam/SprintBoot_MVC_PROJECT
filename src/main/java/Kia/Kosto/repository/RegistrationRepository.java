package Kia.Kosto.repository;


import java.util.Optional;
import org.springframework.data.repository.Repository;

import Kia.Kosto.model.Registration;

public interface RegistrationRepository extends Repository<Registration, Long> {
	Registration save(Registration person);
    Optional<Registration> findById(long id);
}
