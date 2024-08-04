package solid.i.solution;

public class InterfaceSegregationPrincipleDemo {

    public static void main(String[] args) {
        Drivable car = new Car();
        Flyable plane = new Plane();
        Sailable boat = new Boat();

        car.drive();
        plane.fly();
        boat.sail();
    }
}
