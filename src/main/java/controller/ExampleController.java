package controller;

import dao.UserDAO;
import model.User;

public class ExampleController {
    private UserDAO userDAO;

    public ExampleController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void createUser(User user) {
        this.userDAO.save(user);
    }
}
