package bachtiar_firdaus.belajar_java_persistence_api;

import bachtiar_firdaus.belajar_java_persistence_api.entity.Brand;
import bachtiar_firdaus.belajar_java_persistence_api.entity.Product;
import bachtiar_firdaus.belajar_java_persistence_api.entity.SimpleBrand;
import bachtiar_firdaus.belajar_java_persistence_api.util.JpaUtil;
import jakarta.persistence.*;
import jakarta.persistence.criteria.*;
import org.junit.jupiter.api.Test;


import java.util.List;

public class CriteriaTest {

    @Test
    void criteriaQuery() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();

        CriteriaQuery<Brand> criteria = builder.createQuery(Brand.class);
        Root<Brand> b = criteria.from(Brand.class);
        criteria.select(b); // select b from Brand b

        TypedQuery<Brand> query = entityManager.createQuery(criteria);
        List<Brand> brands = query.getResultList();
        for (Brand brand : brands) {
            System.out.println(brand.getId() + " : " + brand.getName());
        }

        entityTransaction.commit();
        entityManager.close();
    }

 
}
