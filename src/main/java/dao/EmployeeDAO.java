package dao;

import java.util.List;
import model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

public class EmployeeDAO implements DAOInterface<Employee> {
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
    
    public List<Employee> all() {
        Query query = this.entityManager.createQuery("* FROM Employee");
        
        return query.getResultList();
    }

    public void update(Employee employee) {}

    public void delete(Employee employee) {}

    public Employee authenticate(String userName, String password) throws Exception {
        Query query = this.entityManager.createQuery("FROM Employee e where e.userName = :username AND e.password = :password");

        query.setParameter("username", userName);
        query.setParameter("password", password);

        try {
            return (Employee) query.getSingleResult();
        } catch (NoResultException exception) {
            throw new Exception("Username do not exists or password is wrong");
        }
    }
}

