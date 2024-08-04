package solid.l.problem;

public class Ostrich
    implements Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich cannot fly");
    }

    @Override
    public void eat() {
        System.out.println("Ostrich is eating");
    }
}
