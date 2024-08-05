package lectureNotes.Java.week2.OOP.encapsulation;

public class Book {

    // private tanımladığımız değişkenlere dışarıdan erişilemez.
    private int pageNumber;
    private String bookName;
    private String author;

    //Değişkenleri, getter ve setter metotları ile dışarıdan erişime açarız.
    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {

        this.pageNumber = pageNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
