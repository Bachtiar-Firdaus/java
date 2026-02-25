package collection.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Person {

    private  String name;

    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public void addHobby(String hobby){
        hobbies.add(hobby);
    }

    public List<String> getHobbies() {
        // immutablelist untuk memprotect agar list tidak bisa di ubah
        return Collections.unmodifiableList(hobbies);

        // ini jika list bisa di ubah
//        return hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
