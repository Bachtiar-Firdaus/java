package bachtiar_firdaus.belajar_java_persistence_api;

import bachtiar_firdaus.belajar_java_persistence_api.entity.Image;
import bachtiar_firdaus.belajar_java_persistence_api.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class LargeObjectTest {

    @Test
    void largeObject() throws IOException {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            Image image = new Image();
            image.setName("Contoh Image");
            image.setDescription("Contoh Deskripsi Image");

            // CARA PALING AMAN: Pake getResourceAsStream
            // Gak perlu pusing masalah path Windows vs Linux (slash vs backslash)
            try (InputStream inputStream = getClass().getResourceAsStream("/images/lenovo.jpg")) {
                if (inputStream == null) {
                    throw new IOException("File /images/lenovo.jpg tidak ditemukan di resources!");
                }

                byte[] bytes = inputStream.readAllBytes();
                image.setImage(bytes);
            }

            entityManager.persist(image);

            entityTransaction.commit();
        } catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
            throw e;
        } finally {
            entityManager.close();
        }
    }
}