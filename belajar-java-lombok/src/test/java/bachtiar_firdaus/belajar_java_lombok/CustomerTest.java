package bachtiar_firdaus.belajar_java_lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    void testCustomer(){
        var customer = new Customer();
        customer.setName("100");
        customer.setId("xx");

        System.out.println(customer.getId());
        System.out.println(customer.getName());
    }

    @Test
    void testCustomerConstructor(){
        var customer = new Customer("ID","NAME");
        Assertions.assertEquals("ID", customer.getId());
        Assertions.assertEquals("NAME", customer.getName());

    }
}
