package kevinlibrary;
import java.util.List;
import java.util.ArrayList;
public class Room {
    private String name;
    private List<Book> bookList;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Book> getBookList() {
        return this.bookList;
    }
    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
    public void addBook(Book myBook) {
        this.bookList.add(myBook);
    }
    public boolean hasBook(String bookName) {

    }
}
