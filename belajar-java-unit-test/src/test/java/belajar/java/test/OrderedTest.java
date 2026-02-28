package belajar.java.test;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.MethodName.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.Random.class)
public class OrderedTest {

    @Test
    @Order(1)
    void test3(){

    }
    @Order(3)
    @Test
    void test2(){

    }
    @Order(2)
    @Test
    void test1(){

    }
}
