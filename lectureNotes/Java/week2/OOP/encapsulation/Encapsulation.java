package lectureNotes.Java.week2.OOP.encapsulation;

public class Encapsulation {

    public static void main(String[] args) {

        Book book = new Book();
        book.setBookName("1984");
        book.setAuthor("George Orwell");
        book.setPageNumber(269);

        System.out.println("Kitap Adi: " + book.getBookName());
        System.out.println("Kitap Yazarı: " + book.getBookName());
        System.out.println("Sayfa Sayısı: " + book.getPageNumber());
    }
}
