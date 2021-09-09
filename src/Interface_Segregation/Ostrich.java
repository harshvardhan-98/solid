package Interface_Segregation;

public class Ostrich implements Bird, RunnerBird{
    @Override
    public void eat(){
        System.out.println("Ostrich eats snake");
    }

    @Override
    public void run(){
        System.out.println("Ostrich runs very fast.");
    }
}
