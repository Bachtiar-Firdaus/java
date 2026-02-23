package belajar.pakage.app;

import belajar.pakage.annotation.Fancy;
import belajar.pakage.data.LoginRequest;
import belajar.pakage.error.ValidationExceptions;
import belajar.pakage.util.ValidationUtil;

public class ValidationApp {
    @Fancy(name = "Car", tags = {"app", "java"})

    static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("", "rahasia");

        try{
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationExceptions | NullPointerException e) {
            System.out.println("Data Tidak Valid : " + e.getMessage());
        } finally {
            System.out.println("Error Gak Error, Tetep Di Panggil");
        }

        LoginRequest loginRequest2 = new LoginRequest(null,null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("sukses");
    }
}
