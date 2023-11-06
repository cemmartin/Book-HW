import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setUp() {
        book = new Book("Pride & Prejudice", "Jane Austen", "Historical Fiction");
    }

    @Test
    public void getTitle(){
        assertEquals("Pride & Prejudice", book.getTitle());
    }

    @Test
    public void getAuthor(){
        assertEquals("Jane Austen", book.getAuthor());
    }

    @Test
    public void getGenre(){
        assertEquals("Historical Fiction", book.getGenre());
    }
}

