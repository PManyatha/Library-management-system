package LibraryManagementSystem;

public class Book {
    private final String title;
    private final String author;
    private final String ISBN;
    private int copies;

    public Book(String title, String author, String ISBN, int copies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.copies = copies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getCopies() {
        return copies;
    }

    public String get_details(){
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }

    public Boolean is_available(){
        return copies > 0;
    }

    public void borrow_book(){
        if(is_available()){
            copies--;
        }
    }
    public void return_book(){
        copies++;
    }
}
