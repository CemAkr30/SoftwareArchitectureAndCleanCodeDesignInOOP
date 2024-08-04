package solid.l.problem;

public class Crow
    implements Bird {
    @Override
    public void fly() {
        System.out.println("Crow is flying");
    }

    @Override
    public void eat() {
        System.out.println("Crow is eating");
    }
}
