package belajar.java.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAddSuccess(){
        var result  = calculator.add(10,10);
        assertEquals(20,result);
        // manual tanpa asertion
//        if(result != 20){
//            throw new RuntimeException("Test gagal");
//        }
    }

    @Test
    public void testDivideSuccess(){
        var result  = calculator.divide(10,10);
        assertEquals(1,result);
    }

    @Test
    public void testDivideFailed(){
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10,0);
        });
    }
}
