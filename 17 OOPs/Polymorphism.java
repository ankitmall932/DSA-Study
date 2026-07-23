public class Polymorphism {
    public static void main(String[] args) {
        Calculator cl = new Calculator();
        cl.sum(1, 2);
        cl.sum(1.5f, 12.5f);
        cl.sum(2, 3, 5);
    }
}

class Calculator {
    int a;
    int b;
    int c;

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(float a, float b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}