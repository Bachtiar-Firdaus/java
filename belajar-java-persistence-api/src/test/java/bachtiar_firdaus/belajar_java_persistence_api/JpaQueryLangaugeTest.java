package bachtiar_firdaus.belajar_java_persistence_api;

import bachtiar_firdaus.belajar_java_persistence_api.entity.Brand;
import bachtiar_firdaus.belajar_java_persistence_api.entity.Member;
import bachtiar_firdaus.belajar_java_persistence_api.entity.Product;
import bachtiar_firdaus.belajar_java_persistence_api.entity.User;
import bachtiar_firdaus.belajar_java_persistence_api.util.JpaUtil;
import jakarta.persistence.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.List;

public class JpaQueryLangaugeTest {

    @Test
    void select() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        TypedQuery<Brand> query = entityManager.createQuery("select b from Brand b", Brand.class);
        List<Brand> brands = query.getResultList();

        for (Brand brand : brands) {
            System.out.println(brand.getId() + " : " + brand.getName());
        }

        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void whereClause() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        TypedQuery<Member> query = entityManager.createQuery("select m from Member m where " +
                "m.name.firstName = :firstName and m.name.lastName = :lastName", Member.class);
        query.setParameter("firstName", "daus");
        query.setParameter("lastName", "firdaus");

        List<Member> members = query.getResultList();
        for (Member member : members) {
            System.out.println(member.getId() + " : " + member.getFullName());
        }

        entityTransaction.commit();
        entityManager.close();
    }

}
