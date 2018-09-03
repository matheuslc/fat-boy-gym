package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connection {
    private static EntityManagerFactory factory;
    private static EntityManager em;

    public static EntityManager entityManager() {
        if (em == null) {
            factory = Persistence.createEntityManagerFactory("fat_boy_gym");
            em = factory.createEntityManager();
        }

        return em;
    }

    public static void closeEntityManager() {
        if (em != null && em.isOpen()) {
            em.close();
            factory.close();
        }
    }
}