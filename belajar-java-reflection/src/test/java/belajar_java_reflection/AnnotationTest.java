package belajar_java_reflection;


import belajar_java_reflection.data.Person;
import belajar_java_reflection.validation.Validator;
import org.junit.jupiter.api.Test;

public class AnnotationTest {

    @Test
    void testValidateUsingAnotation() throws IllegalAccessException {

        Person person = new Person("Daus", "Bachtiar");
        Validator.validateNotBlank(person);

    }
}