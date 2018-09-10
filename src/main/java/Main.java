import controller.EmployeeController;
import controller.UserController;
import dao.Connection;
import dao.EmployeeDAO;
import dao.UserDAO;
import model.Employee;
import model.User;
import view.RegisterEmployeeFrame;

import javax.persistence.EntityManager;
import view.LoginFrame;

public class Main {
    public static void main (String args[])
    {
//        EntityManager manager = Connection.entityManager();
//        EmployeeDAO dao = new EmployeeDAO(manager);
//        Employee employee = new Employee();
//        
//        employee.setName("Carmel");
//        employee.setUserName("carmel25");
//        employee.setPassword("carmel25");
//        
//        dao.save(employee);

        LoginFrame frame = new LoginFrame();
        frame.setVisible(true);        
    }
}
