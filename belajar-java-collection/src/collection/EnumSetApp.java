package collection;

import java.util.EnumSet;

public class EnumSetApp {

    public static enum Gender {
        MALE, FEMALE, NOT_MENTION
    }

    static void main(String[] args) {
        // ini untuk seluruh enum
//        EnumSet<Gender> genders = EnumSet.allOf(Gender.class);

        // ini untuk selected enum
        EnumSet<Gender> genders = EnumSet.of(Gender.MALE, Gender.NOT_MENTION);
        
        for(var val : genders){
            System.out.println(val);
        }
    }
}
