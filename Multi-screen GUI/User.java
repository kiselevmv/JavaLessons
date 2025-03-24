// User.java - Model class representing a user
class User {
    private String name;
    private int age;
    private String email;
    private String gender;

    public User(String name, int age, String email, String gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nEmail: " + email + "\nGender: " + gender + "\n";
    }
}