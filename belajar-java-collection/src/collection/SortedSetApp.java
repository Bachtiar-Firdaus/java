package collection;

import collection.data.Person;
import collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    static void main(String[] args) {

        // untuk desc reversed()
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());
        people.add(new Person("luthfi"));
        people.add(new Person("diki"));
        people.add(new Person("daus"));

        for(var val : people){
            System.out.println(val.getName());
        }

        // untuk immutablenya
        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        // ini sudah tidak bisa karna sudah immutable
//        sortedSet.add(new Person("nia"));

    }
}
