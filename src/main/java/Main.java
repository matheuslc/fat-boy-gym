import controller.UserController;
import dao.Connection;
import dao.UserDAO;
import model.User;

import javax.persistence.EntityManager;

public class Main {
    public static void main (String args[])
    {
        EntityManager entityManager = Connection.entityManager();
        UserDAO userDAO = new UserDAO(entityManager);

        UserController controller = new UserController(userDAO);

        controller.init();

        System.out.printf("Fala tu");
    }
}
