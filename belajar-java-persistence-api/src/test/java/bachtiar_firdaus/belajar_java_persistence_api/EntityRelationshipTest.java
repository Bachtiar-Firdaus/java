package bachtiar_firdaus.belajar_java_persistence_api;


import bachtiar_firdaus.belajar_java_persistence_api.entity.Credential;
import bachtiar_firdaus.belajar_java_persistence_api.entity.User;
import bachtiar_firdaus.belajar_java_persistence_api.entity.Wallet;
import bachtiar_firdaus.belajar_java_persistence_api.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class EntityRelationshipTest {

    @Test
    void oneToOnePersist() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Credential credential = new Credential();
        credential.setId("bachtiar");
        credential.setEmail("bachtiar@example.com");
        credential.setPassword("rahasia");
        entityManager.persist(credential);

        User user = new User();
        user.setId("bachtiar");
        user.setName("Bachtiar Firdaus");
        entityManager.persist(user);

        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void oneToOneFind() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        User user = entityManager.find(User.class, "bachtiar");
        Assertions.assertNotNull(user.getCredential());
        Assertions.assertNotNull(user.getWallet());

        Assertions.assertEquals("bachtiar@example.com", user.getCredential().getEmail());
        Assertions.assertEquals("rahasia", user.getCredential().getPassword());
        Assertions.assertEquals(1_000_000L, user.getWallet().getBalance());

        entityTransaction.commit();
        entityManager.close();
    }


    @Test
    void oneToOneJoinColumn() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        User user = entityManager.find(User.class, "bachtiar");

        Wallet wallet = new Wallet();
        wallet.setUser(user);
        wallet.setBalance(1_000_000L);
        entityManager.persist(wallet);

        entityTransaction.commit();
        entityManager.close();
    }

}
