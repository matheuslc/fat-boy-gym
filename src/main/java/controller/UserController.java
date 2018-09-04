package controller;

import dao.UserDAO;
import model.User;

public class UserController {
    private UserDAO userDAO;

    public UserController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void createUser(User user) {
        this.userDAO.save(user);
    }

    public void init() {
        User user = new User();

        user.setName("Carmel");

        this.createUser(user);
    }
}
