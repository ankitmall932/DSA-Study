public class Constructor {
    public static void main(String[] args) {
        Students s1 = new Students("Ankit mall", 15, "abcd");
        /* System.out.println(s1.name + s1.roll + s1.password); */
        Students s2 = new Students(s1);
        s2.password = "defg";
        System.out.println(s2.name + s2.roll + s2.password);

    }
}

class Students {
    String name;
    int roll;
    String password;

    // non parameterized
    Students() {
        System.out.println("Constructor is called...");
    }

    // parameterized
    Students(String name, int roll, String password) {
        this.name = name;
        this.roll = roll;
        this.password = password;
    }

    // copy constructor
    Students(Students s1) {
        this.name = s1.name;
        this.roll = s1.roll;
    }
}