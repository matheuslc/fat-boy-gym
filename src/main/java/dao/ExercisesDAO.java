package dao;

import model.Exercises;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

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

    public void update(Exercises exercises) {}

    public void delete(Exercises exercises) {}
}
