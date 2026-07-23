
public class Inheritance {
    public static void main(String[] args) {
        /*
         * Dog gullyDog = new Dog();
         * gullyDog.color = "red/black";
         * gullyDog.eat();
         * gullyDog.leg = 4;
         * gullyDog.sound = "Barking";
         * gullyDog.type();
         * System.out.println(gullyDog.color + " " + gullyDog.leg + " " + gullyDog.sound
         * + " ");
         */
        Dog gullyDog = new Dog();
        gullyDog.eat();
        gullyDog.type();
        Labra sLabra = new Labra();
        sLabra.eat();
        sLabra.type1();
    }
}

class Animals {

    void eat() {
        System.out.println("Eats");
    }
}

class Dog extends Animals {
    void type() {
        System.out.println("Dog is Dangerous for the normal people");
    }
}

class Labra extends Animals {
    void type1() {
        System.out.println("It is good bread of dogs");
    }
}