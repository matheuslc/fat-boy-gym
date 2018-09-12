package controller;

import dao.EmployeeDAO;
import model.Employee;
import model.User;

public class AuthController implements ControllerInterface {
    private EmployeeDAO employeeDAO;

    public AuthController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public Employee login(String userName, String password) {
        try {
            return this.employeeDAO.authenticate(userName, password);
        } catch (Exception excetion) {
            return null;
        }
    }

    public void init() { }
}
