package bachtiar_firdaus.belajar_java_persistence_api;


import bachtiar_firdaus.belajar_java_persistence_api.entity.Department;
import bachtiar_firdaus.belajar_java_persistence_api.entity.DepartmentId;
import bachtiar_firdaus.belajar_java_persistence_api.entity.Member;
import bachtiar_firdaus.belajar_java_persistence_api.entity.Name;
import bachtiar_firdaus.belajar_java_persistence_api.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class EmbeddedTest {

    @Test
    void embedded() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Name name = new Name();
        name.setTitle("Mr");
        name.setFirstName("daus");
        name.setMiddleName("bachtiar");
        name.setLastName("firdaus");

        Member member = new Member();
        member.setEmail("eko@example.com");
        member.setName(name);

        entityManager.persist(member);

        entityTransaction.commit();
        entityManager.close();
    }
    @Test
    void embeddedId() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        DepartmentId id = new DepartmentId();
        id.setCompanyId("pzn");
        id.setDepartmentId("tech");

        Department department = new Department();
        department.setId(id);
        department.setName("Teknologi");

        entityManager.persist(department);

        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void embeddedIdFind() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        DepartmentId id = new DepartmentId();
        id.setCompanyId("pzn");
        id.setDepartmentId("tech");

        Department department = entityManager.find(Department.class, id);
        Assertions.assertEquals("Teknologi", department.getName());

        entityTransaction.commit();
        entityManager.close();
    }
}
