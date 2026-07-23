
public class OOPS {
    public static void main(String[] args) {

        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(12);
        System.out.println(p1.color + p1.tip);
        Student p2 = new Student();
        p2.name = "Ankit mall";
        p2.age = 15;
        p2.calcPercentage(15, 25, 26);
        System.out.println(p2.name + " " + p2.age + " " + p2.percentage);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}
