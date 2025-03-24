public class Main {
    public static void main(String[] args) {
        // Create the UserController instance to manage user data
        UserController userController = new UserController();
        
        // Create and display the user form view
        UserFormView userFormView = new UserFormView(userController);
        userFormView.setVisible(true);
    }
}