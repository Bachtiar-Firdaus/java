package generic.application;

import generic.Person;

import java.util.Arrays;

public class ComparableApp {
    static void main(String[] args) {

        Person[] people = {
                new Person("daus", "Indonesia"),
                new Person("adit", "Indonesia"),
                new Person("reza", "Indonesia")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
