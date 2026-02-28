package belajar.java.test;

import belajar.java.test.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
//@DisplayName("Test Untuk Calculator Class")
public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
//    @DisplayName("Test Skenario Sukses untuk method add(integer, integer)")
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

    @Test
    @Disabled
    public void testCommingSoon(){
    }
}
