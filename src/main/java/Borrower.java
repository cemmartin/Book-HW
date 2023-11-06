import java.util.ArrayList;

public class Borrower {

    public String name;

    private ArrayList<Book> borrowersCollection; //the borrower's collection, not the library's

    public Borrower(String borrowerName) {
        this.name = borrowerName;
        this.borrowersCollection = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getBorrowersCollection() {
        return borrowersCollection;
    }

    public void borrowBook(Book book){
        borrowersCollection.add(book);
    }

    public int countBorrowersBooks(){
        return getBorrowersCollection().size();
    }



}
