package belajar.java.test.service;

import belajar.java.test.data.Person;
import belajar.java.test.repository.PersonRepository;

public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person get(String id){
        Person person = personRepository.selectByid(id);

        if(person != null){
            return person;
        }else{
            throw new IllegalArgumentException("Person not found");
        }

    }

}
