import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book1;
    private Book book2;
    private Book book3;

    private Library library;
    private Library library2;

    private Borrower borrower;

    @Before
    public void setUp() throws Exception{
        book1 = new Book("Pride & Prejudice", "Jane Austen", "Historical Fiction");
        book2 = new Book("Stardust", "Neil Gaiman", "Science Fiction");
        book3 = new Book("The Eyre Affair", "Jasper Fforde", "Science Fiction");

        library = new Library(10);
        library2 = new Library(1);

        borrower = new Borrower("Peter");
    }

    @Test
    public void getCapacity(){
        assertEquals(10, library.getCapacity());
    }

    @Test
    public void canCountBooksInLibrary(){
        assertEquals(0, library.countNumberOfBooks());
    }

    @Test
    public void canAddBook(){
        library.addBookToLibrary(book1);
        assertEquals(1, library.countNumberOfBooks()); //not looking for capacity, looking for book count
    }

    @Test
    public void hasCapacity(){
        assertEquals(true, library2.hasCapacityForNewBook());
    }


    @Test //meant to fail
    public void doesNotHaveCapacity(){
        library2.addBookToLibrary(book2);
        library2.addBookToLibrary(book3);
        assertEquals(false, library2.hasCapacityForNewBook());
    }


    @Test
    public void removeBook(){
        library.addBookToLibrary(book2);
        library.addBookToLibrary(book3);
        library.removeBookFromLibrary(book2, borrower);
        assertEquals(1, library.countNumberOfBooks());
        assertEquals(1, borrower.countBorrowersBooks());
    }

}
