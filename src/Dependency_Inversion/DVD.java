package Dependency_Inversion;

public class DVD implements Product{
    @Override
    public void seeReviews() {
        System.out.println("See reviews of book.");
    }

    @Override
    public void getSample() {
        System.out.println("Get a free sample book from here.");
    }
}
