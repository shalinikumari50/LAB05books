package book;

public class Book {
    private String bookName;
    private String authorName;
    private String isbn;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Book(String bookName, String authorName, String isbn) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbn = isbn;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("-----------------------------" + "\n");
        result.append("Book Name:\t" + getBookName() + "\n" + "Author Name:\t" + getAuthorName() + "\n" + "ISBN:\t" + getIsbn() + "\n");
        result.append("-----------------------------");
        return result.toString();

    }


}
