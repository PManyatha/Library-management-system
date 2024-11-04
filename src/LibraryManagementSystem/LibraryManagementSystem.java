package LibraryManagementSystem;


public class LibraryManagementSystem {
        public static void main(String[] args) {

            Library library = new Library();
            Librarian librarian = new Librarian("Sham", "L001");


            Book book1 = new Book("JAVA", "ABC", "ISBN12345", 3);
            Book book2 = new Book("Software Testing", "PQR", "ISBN67890", 2);

            librarian.add_book(library, book1);
            librarian.add_book(library, book2);
            System.out.println("Books added to the library by the librarian.\n");


            Member member = new Member("Ram", "M001");
            library.register_member(member);
            System.out.println("Member registered: " + member.getName() + "\n");


            System.out.println("Member is borrowing a book:");
            library.issue_book("M001", "ISBN12345");  // Bob borrows "The Great Gatsby"

            System.out.println("\nChecking availability after borrowing:");
            library.list_all_books();


            System.out.println("\nMember is returning the book:");
            library.receive_book("M001", "ISBN12345");


            System.out.println("\nUpdated inventory after returning the book:");
            library.list_all_books();
        }
    }
