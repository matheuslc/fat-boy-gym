package dao;

import model.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class UserDAO {
    private EntityManager entityManager;

    public UserDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(User user) {
        EntityTransaction transaction = this.entityManager.getTransaction();

        transaction.begin();
        this.entityManager.persist(user);
        transaction.commit();
    }
}
