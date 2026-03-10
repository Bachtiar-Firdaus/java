package bachtiar_firdaus.belajar_java_lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {
    @Test
    void testCreate(){

        var login1 = Login.createEmpy();
        Assertions.assertNull(login1.getUsername());
        Assertions.assertNull(login1.getPassword());

        var login2 = Login.create("Bachtiar","Firdaus");
        Assertions.assertEquals("Bachtiar", login2.getUsername());
        Assertions.assertEquals("Firdaus", login2.getPassword());

    }

    @Test
    void testToString(){
        var login = Login.create("Bachtiar", "Firdaus");
        System.out.println(login);
    }
}
