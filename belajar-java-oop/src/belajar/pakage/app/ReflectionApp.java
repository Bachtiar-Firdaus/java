package belajar.pakage.app;

import belajar.pakage.data.CreateUserRequest;
import belajar.pakage.util.ValidationUtil;

public class ReflectionApp {
    static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("root");
        request.setPassword("root");

        ValidationUtil.validationReflection(request);
    }
}
