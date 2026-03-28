package bachtiar_firdaus.belajar_java_persistence_api;


import bachtiar_firdaus.belajar_java_persistence_api.entity.Member;
import bachtiar_firdaus.belajar_java_persistence_api.entity.Name;
import bachtiar_firdaus.belajar_java_persistence_api.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.HashMap;

public class CollectionTest {

    @Test
    void create() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Name name = new Name();
        name.setFirstName("daus");
        name.setMiddleName("Bachtiar");
        name.setLastName("Firdaus");

        Member member = new Member();
        member.setEmail("test@example.com");
        member.setName(name);

        member.setHobbies(new ArrayList<>());
        member.getHobbies().add("Coding");
        member.getHobbies().add("Gaming");

        entityManager.persist(member);

        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void update() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Member member = entityManager.find(Member.class, 2);

        member.getHobbies().add("Traveling");

        entityManager.merge(member);

        entityTransaction.commit();
        entityManager.close();
    }

}