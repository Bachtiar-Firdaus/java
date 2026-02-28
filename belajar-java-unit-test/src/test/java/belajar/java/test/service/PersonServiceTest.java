package belajar.java.test.service;

import belajar.java.test.data.Person;
import belajar.java.test.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@Extensions({
        @ExtendWith(MockitoExtension.class)
})
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    private PersonService personService;

    @BeforeEach
    void setUp(){
        personService = new PersonService(personRepository);
    }

    @Test
    void testGetPersonNotFound(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            personService.get("not found");
        });
    }

    @Test
    void testGetPersonSuccess(){
        // menambah behavior ke mock object
        Mockito.when(personRepository.selectByid("daus"))
                .thenReturn(new Person("daus","Daus"));

        var person = personService.get("daus");

        Assertions.assertNotNull(person);
        Assertions.assertEquals("daus",person.getId());
        Assertions.assertEquals("Daus",person.getName());
    }

    @Test
    void testRegisterSuccess(){
        var person = personService.register("Daus");
        Assertions.assertNotNull(person);
        Assertions.assertEquals("Daus", person.getName());
        Assertions.assertNotNull(person.getId());

        Mockito.verify(personRepository, Mockito.times(1))
                .insert(new Person(person.getId(), "Daus"));
    }
}
