package classes;

import java.util.Random;

public class RandomApp {
    static void main(String[] args) {

        Random random = new Random();

        for(var i = 0; i < 10; i++){
            int value = random.nextInt(1000);
            System.out.println(value);
        }
    }
}
