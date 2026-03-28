package bachtiar_firdaus.belajar_java_persistence_api;


import bachtiar_firdaus.belajar_java_persistence_api.entity.Customer;
import bachtiar_firdaus.belajar_java_persistence_api.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Test;

public class ColumnTest {

    @Test
    void column() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Customer customer = new Customer();
        customer.setId("1");
        customer.setName("daus");
        customer.setPrimaryEmail("contoh@example.com");

        entityManager.persist(customer);

        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void transientTest() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Customer customer = new Customer();
        customer.setId("4");
        customer.setName("Daus");
        customer.setPrimaryEmail("contoh@example.com");
        customer.setFullName("Bachtiar Firdaus");

        entityManager.persist(customer);

        entityTransaction.commit();
        entityManager.close();
    }
}
