package belajar.java.test.repository;

import belajar.java.test.data.Person;

public interface PersonRepository {
    Person selectByid(String id);
}
