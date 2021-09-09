package Interface_Segregation;

public class Penguin implements Bird, SwimmerBird {
    @Override
    public void eat() {
        System.out.println("Penguin eats fish.");
    }

    @Override
    public void swim() {
        System.out.println("Penguin swims in cold water.");
    }
}
