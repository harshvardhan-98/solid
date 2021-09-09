package Dependency_Inversion;


public class Shelf {
    Product product;
    void addProduct(){
        System.out.println("This product has been added into your shopping cart.");
    }

    void customizeShelf(){
        System.out.println("Please visit the store.");
    }
}


