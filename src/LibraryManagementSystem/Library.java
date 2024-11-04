package LibraryManagementSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Library {
    private Map<String, Book> books;  // Dictionary with ISBN as keys and Book objects as values
    private Map<String, Member> members;  // Dictionary with member_id as keys and Member objects as values

    public Library() {
        this.books = new HashMap<>();
        this.members = new HashMap<>();
    }

    public void register_member(Member member) {
        if (!members.containsKey(member.member_id)) {
            members.put(member.member_id, member);
        }
    }

    public void issue_book(String member_id, String book_isbn) {
        Member member = members.get(member_id);
        Book book = books.get(book_isbn);

        if (member != null && book != null && book.is_available()) {
            member.borrow_book(book);
        } else {
            System.out.println("Cannot issue book.");
        }
    }

    public void receive_book(String member_id, String book_isbn) {
        Member member = members.get(member_id);
        Book book = books.get(book_isbn);

        if (member != null && book != null) {
            member.return_book(book);
        } else {
            System.out.println("Cannot receive book.");
        }
    }

    public void add_book_to_inventory(Book book) {
        books.putIfAbsent(book.getISBN(), book);
    }

    public void remove_book_from_inventory(String book_isbn) {
        books.remove(book_isbn);
    }

    public void list_all_books() {
        for (Book book : books.values()) {
            System.out.println(book.get_details());
        }
    }


    public void search_books_by_title(String title) {
        for (Book book : books.values()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book.get_details());
            }
        }
    }


    public String get_details() {
        return "Library with " + books.size() + " books and " + members.size() + " members.";
    }
}
