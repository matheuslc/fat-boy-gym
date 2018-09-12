package dao;

import java.util.List;
import model.Exercises;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class ExercisesDAO implements DAOInterface<Exercises> {
    private EntityManager entityManager;

    public ExercisesDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Exercises exercises) {
        EntityTransaction transaction = this.entityManager.getTransaction();

        transaction.begin();
        this.entityManager.persist(exercises);
        transaction.commit();
    }
    
    public List<Exercises> all() {
        Query query = this.entityManager.createQuery("* FROM Exercises");
        
        return query.getResultList();
    }

    public void update(Exercises exercises) {}

    public void delete(Exercises exercises) {}
}
