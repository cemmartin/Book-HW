import java.util.ArrayList;

public class Library {

    private int capacity;

    private ArrayList<Book> libraryCollection;

    public Library(int capacity) {
        this.capacity = capacity;
        this.libraryCollection = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Book> getLibraryCollection() {
        return libraryCollection;
    }

    public void setLibraryCollection(ArrayList<Book> libraryCollection) {
        this.libraryCollection = libraryCollection;
    }

    public boolean hasCapacityForNewBook(){
        return capacity > libraryCollection.size();
    }

//    public void addBookToLibrary(Book book){
//        libraryCollection.add(book);
//    } //modified to the below to check if library is full

    public void addBookToLibrary(Book book){
        if(hasCapacityForNewBook()){
            libraryCollection.add(book);
        }
    }
    public int countNumberOfBooks(){
        return getLibraryCollection().size();
    }
//    public void removeBookFromLibrary(Book book){
//        libraryCollection.remove(book);
//    } //replaced by the below code

    public void removeBookFromLibrary(Book book, Borrower borrower){
        if(this.libraryCollection.contains(book)){
            this.libraryCollection.remove(book);
            borrower.borrowBook(book);
        }
    }

}
