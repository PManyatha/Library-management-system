package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    String member_id;
    private List<Book> borrowed_books;

    public Member(String name, String member_id) {
        this.name = name;
        this.member_id = member_id;
        this.borrowed_books = new ArrayList<>();
    }

    // Getter for the name attribute
    public String getName() {
        return name;
    }

    public void borrow_book(Book book) {
        if (book.is_available()) {
            borrowed_books.add(book);
            book.borrow_book();
        }
    }

    public void return_book(Book book) {
        borrowed_books.remove(book);
        book.return_book();
    }

    public List<Book> list_borrowed_books() {
        return borrowed_books;
    }
}
