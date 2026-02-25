package collection;

import collection.data.Person;

import java.util.List;

public class MutableApp {
    static void main(String[] args) {

        Person person = new Person("daus");

        person.addHobby("belajar");
        person.addHobby("ngoding");

        doSomethingWithHobbies(person.getHobbies());

        for(var hobby : person.getHobbies()){
            System.out.println(hobby);
        }

    }

    public static void doSomethingWithHobbies(List<String> hobbies){

          // sudah di immutable list jadi tidak bisa di rubah
//        hobbies.add("bukan hobbis");
    }
}
