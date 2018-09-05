import controller.EmployeeController;
import controller.UserController;
import dao.Connection;
import dao.EmployeeDAO;
import dao.UserDAO;
import model.Employee;
import model.User;
import view.RegisterEmployeeFrame;

import javax.persistence.EntityManager;

public class Main {
    public static void main (String args[])
    {
        EntityManager entityManager = Connection.entityManager();

        UserDAO userDAO = new UserDAO(entityManager);
        EmployeeDAO employeeDAO = new EmployeeDAO(entityManager);

        UserController userController = new UserController(userDAO);
        final EmployeeController employeeController = new EmployeeController(employeeDAO);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegisterEmployeeFrame frame = new RegisterEmployeeFrame();
                frame.setVisible(true);

                Employee employee = new Employee();

                employee.setName("Carmel");

                employeeController.createEmployee(employee);
            }
        });

        System.out.printf("Fala tu");
    }
}
