package generic.application;

import generic.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    static void main(String[] args) {
        Person[] people = {
                new Person("daus", "Indonesia"),
                new Person("adit", "Indonesia"),
                new Person("reza", "Indonesia")
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people, comparator);
        System.out.println(Arrays.toString(people));
    }
}
