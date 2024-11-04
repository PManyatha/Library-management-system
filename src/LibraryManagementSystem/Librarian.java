package LibraryManagementSystem;

public class Librarian extends User {
    private String employee_id;

    public Librarian(String name, String employee_id) {
        super(name);
        this.employee_id = employee_id;
    }

    public void add_book(Library library, Book book) {
        library.add_book_to_inventory(book);
    }

    public void remove_book(Library library, String book_isbn) {
        library.remove_book_from_inventory(book_isbn);
    }

    @Override
    public String get_details() {
        return "Librarian Name: " + name + ", Employee ID: " + employee_id;
    }
}
