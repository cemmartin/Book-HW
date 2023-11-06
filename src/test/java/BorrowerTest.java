import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;

    @Before
    public void setUp() throws Exception{
        book = new Book("Early Riser", "Jasper Fforde", "Science Fiction");
        borrower = new Borrower("Peter");
    }

    @Test
    public void getName(){
        assertEquals("Peter", borrower.getName());
    }

    @Test
    public void testBorrowBook(){
        borrower.borrowBook(book);
        assertEquals(1, borrower.countBorrowersBooks());
    }



}
