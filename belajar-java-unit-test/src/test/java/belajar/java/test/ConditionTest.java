package belajar.java.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.util.Properties;

public class ConditionTest {

    @Test
    void testSystemProperties(){
        Properties properties = System.getProperties();
        properties.forEach((k,v)-> System.out.println(k + ": "+v));
    }


    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testEnableOnWindows(){

    }

    @Test
    @DisabledOnOs({OS.WINDOWS})
    public void testDisabledOnWindows(){

    }


    @Test
    @EnabledOnJre({JRE.JAVA_8})
    public void testEnableOnJava8(){

    }

    @Test
    @DisabledOnJre({JRE.JAVA_8})
    public void testDisabledOnJava8(){

    }


    @Test
    @EnabledForJreRange(min = JRE.JAVA_15, max = JRE.JAVA_16)
    public void testEnableOnJava15to16(){

    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_16)
    public void testDisabledOnJava11to16(){

    }

    @Test
    @EnabledIfSystemProperties({
            @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    })
    void testEnabledJavaVendorOracle(){

    }


    @Test
    @DisabledIfSystemProperties({
            @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    })
    void testDisabledJavaVendorOracle(){

    }

    @Test
    @EnabledIfEnvironmentVariables({
            @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    })
    void testEnabledOnProfileDev(){

    }

    @Test
    @DisabledIfEnvironmentVariables({
            @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    })
    void testDisabledOnProfileDev(){

    }


}
