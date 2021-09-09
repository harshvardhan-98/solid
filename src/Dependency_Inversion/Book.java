package Dependency_Inversion;

public class Book implements Product{
    @Override

    public void seeReviews() {
        System.out.println("This is the most selling book of the year!");
    }

    @Override
    public void getSample() {
        System.out.println("Do yoy want to  purchase this book? Please visit our store");
    }
}
