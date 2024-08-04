package solid.l.solution;

public class Crow implements FlyingBird{
    @Override
    public void eat() {
        System.out.println("Crow is eating");
    }

    @Override
    public void fly() {
        System.out.println("Crow is flying");
    }
}
