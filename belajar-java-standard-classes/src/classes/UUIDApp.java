package classes;

import java.util.UUID;

public class UUIDApp {
    static void main(String[] args) {

        for (var i = 0; i < 10; i++){
            UUID uuid = UUID.randomUUID();
            String key = uuid.toString();

            System.out.println(key);
        }
    }
}
