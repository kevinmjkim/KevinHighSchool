import java.util.List;
import java.util.ArrayList;
import kevinlibrary.Book;
import kevinlibrary.Author;
import kevinlibrary.Room;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
   public static void main(String[] args) {
       Book myBook = new Book();
       myBook.setTitle("Animal Farm");
       myBook.setPageNumber(114);
       System.out.println("The book I created is " + myBook.getTitle());
       System.out.println("The number of pages in this book is " + myBook.getPageNumber());

       Author myAuthor = new Author();
       myAuthor.setFirstName("Bob");
       myAuthor.setLastName("Chicken");
       myAuthor.setDateOfBirth("November 11, 2023");

       System.out.println("The author's first name is " + myAuthor.getFirstName());
       System.out.println("The author's last name is " + myAuthor.getLastName());
       System.out.println("The author's date of birth is " + myAuthor.getDateOfBirth());

       myBook.setAuthor(myAuthor);
       System.out.println("The book's author's first name is " + myBook.getAuthor().getFirstName());
       myBook.setAuthor(myAuthor);
       System.out.println("The book's author's last name is " + myBook.getAuthor().getLastName());
       myBook.setAuthor(myAuthor);
       System.out.println("The book's author's date of birth is " + myBook.getAuthor().getDateOfBirth());

       Room myRoom = new Room();
       myRoom.setName("Gaming Room");
       List<Book> myListOfBooks = new ArrayList<>();
       myListOfBooks.add(myBook);
       myRoom.setBookList(myListOfBooks);
       System.out.println("The new room's name is " + myRoom.getName());
       System.out.println("This room has " + myRoom.getBookList().size() + " book(s)!");
       System.out.println("The only book in this room has a title of " + myRoom.getBookList().get(0).getTitle());
    }
}
