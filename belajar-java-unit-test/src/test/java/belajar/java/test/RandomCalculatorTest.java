package belajar.java.test;

import belajar.java.test.resolver.RandomParameterResolver;
import org.junit.jupiter.api.*;
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

    @DisplayName("Test Random Calculator")
    @RepeatedTest(value = 10, name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
    void testRandomRepeat(TestInfo info, Random random, RepetitionInfo repetitionInfo){
        System.out.println(info.getDisplayName() + " ke " + repetitionInfo.getCurrentRepetition() + " dari " + repetitionInfo.getTotalRepetitions());
        var a = random.nextInt();
        var b = random.nextInt();

        var rest = calculator.add(a,b);
        var expected = a + b;

        Assertions.assertEquals(expected, rest);
    }
}
