package belajar.pakage.util;

import belajar.pakage.data.LoginRequest;
import belajar.pakage.error.BlankException;
import belajar.pakage.error.ValidationExceptions;

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
}
