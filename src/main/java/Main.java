import controller.ExampleController;
import dao.Connection;
import dao.UserDAO;
import model.User;

import javax.persistence.EntityManager;

public class Main {
    public static void main (String args[])
    {
        EntityManager entityManager = Connection.entityManager();
        UserDAO userDAO = new UserDAO(entityManager);

        ExampleController controller = new ExampleController(userDAO);

        User user = new User();

        user.setName("Carmel");

        controller.createUser(user);

        System.out.printf("Fala tu");
    }
}
