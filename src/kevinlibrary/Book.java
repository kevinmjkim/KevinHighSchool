package kevinlibrary;

public class Book {
    private String title;
private Author author;
    private int pageNumber;
public Author getAuthor() {
    return this.author;
    }
    public void setAuthor(Author author) {
    this.author = author;
    }
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNumber() {
        return this.pageNumber;
    }
public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

}