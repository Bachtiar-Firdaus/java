package bachtiar.firdaus.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {

    @Test
    void testMessageFormat(){
        var pattern = "Hi {0}, Anda bisa mencari data dengan mengetikan \"{1}\" di pencarian";
        var messageFormat = new MessageFormat(pattern);

        var format = messageFormat.format(new Object[]{
                "Daus","Dayat"
        });
        System.out.println(format);


    }


    @Test
    void testMessageFormatBundle(){
        var locale = new Locale("id", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);

        var pattern = resourceBundle.getString("welcome.message");

        var messageFormat = new MessageFormat(pattern);


        var format = messageFormat.format(new Object[]{
                "Bachtiar","Lampung"
        });
        System.out.println(format);

    }
}
