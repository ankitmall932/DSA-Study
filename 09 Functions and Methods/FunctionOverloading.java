
public class FunctionOverloading{
    public static int multiply(int a , int b){
        return a*b;
    }

    public static int multiply(int a, int b, int c){
        return a*b*c;
    }

    public static float multiply (float a, float b){
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println(multiply(8, 9));
        System.out.println(multiply(5, 6, 8));
        System.out.println(multiply(8.5f, 9.5f));
    }
}