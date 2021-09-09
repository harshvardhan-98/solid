package Dependency_Inversion;

public class Main {
    public static void main(String[] args) {
        Book book=new Book();
        Shelf shelf=new Shelf();
        DVD dvd=new DVD();
        shelf.customizeShelf();
        shelf.addProduct();
        book.getSample();
        book.seeReviews();
        dvd.getSample();
        dvd.seeReviews();
    }
}
