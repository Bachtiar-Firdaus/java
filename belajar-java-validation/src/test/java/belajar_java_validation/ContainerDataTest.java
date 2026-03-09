package belajar_java_validation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ContainerDataTest extends AbstractValidatorTest{

    @Test
    void testContainerData() {

        Person person = new Person();
        person.setFirstName("Daus");
        person.setLastName("Daus");
        person.setAddress(new Address());
        person.getAddress().setCity("Lampung");
        person.getAddress().setCountry("Indonesia");
        person.getAddress().setStreet("Bla bla bla");

        person.setHobbies(new ArrayList<>());
        person.getHobbies().add("");
        person.getHobbies().add("   ");
        person.getHobbies().add("Gaming");

        validate(person);

    }
}
