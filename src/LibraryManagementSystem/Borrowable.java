package LibraryManagementSystem;

public interface Borrowable {
    void borrow_book(Book book);
    void return_book(Book book);
}
