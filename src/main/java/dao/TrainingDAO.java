package dao;

import java.util.List;
import model.Training;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class TrainingDAO implements DAOInterface<Training> {
    private EntityManager entityManager;

    public TrainingDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Training training) {
        EntityTransaction tx = this.entityManager.getTransaction();

        tx.begin();
        this.entityManager.persist(training);
        tx.commit();
    }

    public void update(Training training) {}

    public void delete(Training training) {
        EntityTransaction tx = this.entityManager.getTransaction();

        tx.begin();
        this.entityManager.remove(training);
        tx.commit();
    }
    
    public List<Training> all() {
        Query query = this.entityManager.createQuery("* FROM Training");
        
        return query.getResultList();
    }
}
