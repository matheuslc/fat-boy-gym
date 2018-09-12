package dao;

import java.util.List;
import model.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

public class UserDAO implements DAOInterface<User> {
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

    public void update(User user) {}

    public void delete(User user) {}
    
    public List<User> all() {
        Query query = this.entityManager.createQuery("* FROM Users");

        return query.getResultList();
    }
}
