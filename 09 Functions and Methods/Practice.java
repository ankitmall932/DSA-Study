public class Practice {
/*     //1 
    public static float average(int a, int b, int c){
        float avg=(a+b+c)/3f;
        return avg;
    }
    public static void main(String[] args) {
        System.out.println(average(10, 25, 19));
    } */

    /* //2
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isEven(9));
    } */
    
    //3
    public static boolean number(int a){
        int original = a;
        int reverse = 0;
        while (a != 0) {
            int remainder = a % 10;
            reverse = reverse * 10 + remainder;
            a = a / 10; 
        }
        return original == reverse;
    }
    public static void main(String[] args) {
        if (number(121)) {
            System.out.println("number is palindrome ");
        }else{
            System.out.println("number is not palindrome");
        }
    }
}
