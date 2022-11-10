package week2.mission1.object_array;

public class Book implements Cloneable {
    private String bookTitle;
    private String author;


    public Book(String bookTitle, String author) {
        this.bookTitle = bookTitle;
        this.author = author;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String showBookInfo() {
         return "[" + bookTitle + "|" + author + "]";
    }
}