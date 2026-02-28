package belajar.java.test;

import org.junit.jupiter.api.*;


//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OrderedTest {

    private int counter = 0;

    @BeforeAll
    void beforeAll(){

    }
    @AfterAll
    void afterAll(){

    }



    @Test
    @Order(1)
    void test3(){
        counter++;
        System.out.println(counter);

    }
    @Order(3)
    @Test
    void test2(){
        counter++;
        System.out.println(counter);

    }
    @Order(2)
    @Test
    void test1(){
        counter++;
        System.out.println(counter);

    }
}
