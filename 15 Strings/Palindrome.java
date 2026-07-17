
public class Palindrome {
    //check if a a given number is palindrome or not.
/*         public static boolean number(int a){
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
    } */

    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        boolean result=isPalindrome(str);
        if(result==true){
            System.out.println("The given word is palindrome");
        }else{
            System.out.println("The given word is not a palindrome");
        }
    }
}
