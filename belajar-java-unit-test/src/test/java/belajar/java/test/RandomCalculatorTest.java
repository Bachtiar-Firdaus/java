package belajar.java.test;

import belajar.java.test.resolver.RandomParameterResolver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

import java.util.Random;


public class RandomCalculatorTest extends AbstractCalculatorTest{

    @Test
    void testRandom(Random random){
        var a = random.nextInt();
        var b = random.nextInt();

        var rest = calculator.add(a,b);
        var expected = a + b;

        Assertions.assertEquals(expected, rest);
    }
}
