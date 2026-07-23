import java.text.Annotation;

public class Abstract {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        Hen c1 = new Hen();
        c1.eat();
        c1.walk();
    }
}

abstract class Animals {
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animals {
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Hen extends Animals {
    void walk() {
        System.out.println("walks on 2 leg");
    }
}
