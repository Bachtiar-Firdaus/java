package bachtiar_firdaus.belajar_java_persistence_api;

import bachtiar_firdaus.belajar_java_persistence_api.entity.Brand;
import bachtiar_firdaus.belajar_java_persistence_api.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.LockModeType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.time.LocalDateTime;

public class LockingTest {

    @Test
    void optimisticLocking() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Brand brand = new Brand();
        brand.setId("nokia");
        brand.setName("Nokia");
        brand.setCreatedAt(LocalDateTime.now());
        brand.setUpdatedAt(LocalDateTime.now());
        entityManager.persist(brand);

        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void optimisticLockingDemo1() throws InterruptedException {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Brand brand = entityManager.find(Brand.class, "nokia");
        brand.setName("Nokia Demo 1");
        brand.setUpdatedAt(LocalDateTime.now());

        Thread.sleep(10 * 1000L);
        entityManager.persist(brand);

        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void optimisticLockingDemo2() throws InterruptedException {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Brand brand = entityManager.find(Brand.class, "nokia");
        brand.setName("Nokia Demo 2");
        brand.setUpdatedAt(LocalDateTime.now());
        entityManager.persist(brand);

        entityTransaction.commit();
        entityManager.close();
    }
    
}
