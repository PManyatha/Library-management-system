package LibraryManagementSystem;

public abstract class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    // Abstract method to be implemented by subclasses
    public abstract String get_details();
}

