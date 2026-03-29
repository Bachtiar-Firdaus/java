package bachtiar_firdaus.belajar_java_record.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void createNewRecord() {
        var customer = new Customer("1", "Daus", "daus@localhost", "082131231");
        assertNotNull(customer);

        System.out.println(customer);
    }

    @Test
    void getProperty() {
        var customer = new Customer("1", "Daus", "daus@localhost", "082131231");
        assertNotNull(customer);
        assertEquals("1", customer.id());
        assertEquals("Daus", customer.name());
        assertEquals("daus@localhost", customer.email());
        assertEquals("082131231", customer.phone());
    }

    @Test
    void constructor() {
        var customer = new Customer("1", "Daus", "daus@localhost");
        assertNotNull(customer);
        assertEquals("1", customer.id());
        assertEquals("Daus", customer.name());
        assertEquals("daus@localhost", customer.email());
        assertNull(customer.phone());
    }

    @Test
    void canonicalConstructor() {
        var customer = new Customer("1", "Daus", "DAUS@LOCALHOST");
        assertNotNull(customer);
        assertEquals("1", customer.id());
        assertEquals("Daus", customer.name());
        assertEquals("daus@localhost", customer.email());
        assertNull(customer.phone());
    }

    @Test
    void recordMethod() {
        var customer = new Customer("1", "Daus", "DAUS@LOCALHOST");
        assertEquals("Hello Budi, my name is Daus", customer.sayHello("Budi"));
    }
}