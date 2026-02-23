package belajar.pakage.util;

import belajar.pakage.annotation.NotBlank;
import belajar.pakage.data.LoginRequest;
import belajar.pakage.error.BlankException;
import belajar.pakage.error.ValidationExceptions;

import java.lang.reflect.Field;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationExceptions, NullPointerException{
        if(loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        }else if(loginRequest.username().isBlank()){
            throw new ValidationExceptions("Username is Blank");
        }else if(loginRequest.password() == null){
            throw new NullPointerException("Password is null");
        }else if(loginRequest.password().isBlank()){
            throw new ValidationExceptions("Password is Blank");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest) {
        if(loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        }else if(loginRequest.username().isBlank()){
            throw new BlankException("Username is Blank");
        }else if(loginRequest.password() == null){
            throw new NullPointerException("Password is null");
        }else if(loginRequest.password().isBlank()){
            throw new BlankException("Password is Blank");
        }
    }

    public static void validationReflection(Object object){
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields) {
            field.setAccessible(true);

            if(field.getAnnotation(NotBlank.class) != null){
                // validation
                try {
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()){
                        throw new BlankException("Field "+ field.getName()+ " is blank");
                    }

                } catch (IllegalAccessException exception){
                    System.out.println("Tidak bisa mengakses field" + field.getName());

                }
            }
        }
    }
}
