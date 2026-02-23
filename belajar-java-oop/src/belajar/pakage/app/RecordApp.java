package belajar.pakage.app;

import belajar.pakage.data.LoginRequest;

public class RecordApp {
    static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("daus", "rahasia");
        System.out.println(loginRequest);
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("daus"));
        System.out.println(new LoginRequest("daus","rahasia"));
    }
}
