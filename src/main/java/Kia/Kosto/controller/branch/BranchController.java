package Kia.Kosto.controller.branch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Kia.Kosto.model.Person;
import Kia.Kosto.model.Registration;
import Kia.Kosto.repository.PersonRepository;
import Kia.Kosto.repository.RegistrationRepository;
@RestController
@RequestMapping("/branch")
public class BranchController {
	
	 @Autowired
	    private PersonRepository personRepository;
	 
	 @Autowired
	 private RegistrationRepository  registrationRepository; 

	    @GetMapping("/savePerson")
	    public String savePerson() {
	        // Create a new Person
	        Person person = new Person("John Doe asa");

	        // Save the person to the database using the repository
	        personRepository.save(person);

	        return "Person saved: " + person.getId();
	    }

	    @GetMapping("/registration")
	    public String registration() {
	        // Create a new Person
	    	Registration person = new Registration("John Doe asa","fgdh","@hgfh");

	        // Save the person to the database using the repository
	    	registrationRepository.save(person);

	        return "Registration done: " + person.getId();
	    }
    @GetMapping("/branch")
    public String branch() {
    	
        return "Branch"; // Assuming you have a Thymeleaf template named "branch.html"
    }
}
