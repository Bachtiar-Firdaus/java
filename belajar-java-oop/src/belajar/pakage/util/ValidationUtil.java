package belajar.pakage.util;

import belajar.pakage.data.LoginRequest;
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
}
