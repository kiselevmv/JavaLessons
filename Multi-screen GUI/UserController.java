// UserController.java - Manages user data
import java.util.ArrayList;
import java.util.List;

class UserController {
    private List<User> users;

    public UserController() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }
}