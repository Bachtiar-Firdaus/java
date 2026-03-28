package bachtiar_firdaus.belajar_java_persistence_api;

import bachtiar_firdaus.belajar_java_persistence_api.entity.Employee;
import bachtiar_firdaus.belajar_java_persistence_api.entity.Manager;
import bachtiar_firdaus.belajar_java_persistence_api.entity.VicePresident;
import bachtiar_firdaus.belajar_java_persistence_api.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.time.LocalDateTime;

public class InheritanceTest {

    @Test
    void singleTableInsert() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Employee employee = new Employee();
        employee.setId("rina");
        employee.setName("Rina Wati");
        entityManager.persist(employee);

        Manager manager = new Manager();
        manager.setId("joko");
        manager.setName("Jomo Morro");
        manager.setTotalEmployee(10);
        entityManager.persist(manager);

        VicePresident vp = new VicePresident();
        vp.setId("budi");
        vp.setName("Budi Nugraha");
        vp.setTotalManager(5);
        entityManager.persist(vp);

        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void singleTableFind() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Manager manager = entityManager.find(Manager.class, "joko");
        Assertions.assertEquals("Jomo Morro", manager.getName());

        Employee employee = entityManager.find(Employee.class, "budi");
        VicePresident vicePresident = (VicePresident) employee;
        Assertions.assertEquals("Budi Nugraha", vicePresident.getName());

        entityTransaction.commit();
        entityManager.close();
    }

}