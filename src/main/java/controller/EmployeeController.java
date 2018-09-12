package controller;

import dao.EmployeeDAO;
import model.Employee;

public class EmployeeController implements ControllerInterface {
    private EmployeeDAO employeeDAO;

    public EmployeeController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public void createEmployee(Employee employee) {
        this.employeeDAO.save(employee);
    }

    public void init() {

    }
}
