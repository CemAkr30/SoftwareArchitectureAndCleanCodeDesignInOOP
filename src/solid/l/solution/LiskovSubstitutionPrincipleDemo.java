package solid.l.solution;

public class LiskovSubstitutionPrincipleDemo {

    public static void main(String[] args) {
        FlyingBird[] flyingBirds = new FlyingBird[] { new Sparrow(), new Crow() };

        for (FlyingBird bird : flyingBirds) {
            bird.fly();
            bird.eat();
        }

        System.out.println("**********");

        // Uçmayan kuşları farklı bir şekilde işleyebiliriz
        Bird[] birds = new Bird[] { new Ostrich() };
        for (Bird bird : birds) {
            bird.eat();
        }
    }
}
