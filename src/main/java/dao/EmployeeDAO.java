package dao;

import model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class EmployeeDAO {
    private EntityManager entityManager;

    public EmployeeDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Employee employee) {
        EntityTransaction transaction = this.entityManager.getTransaction();

        transaction.begin();
        this.entityManager.persist(employee);
        transaction.commit();
    }

    public void update(Employee employee) {}

    public void delete(Employee employee) {}
}

