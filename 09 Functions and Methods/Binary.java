import java.util.*;

public class Binary {
    public static void binToDec(int a){
        int number=a;
        int pow=0;
        int dec=0;
        while (a>0) {
            int lastDigit=a%10;
            dec=dec+(lastDigit*(int)Math.pow(2, pow));
            pow++;
            a=a/10;
        }
        System.out.println("decimal of " + number + " = " + dec);
    }

    public static void decToBin(int a){
        int number=a;
        int pow=0;
        int bin=0;
        while (a>0) {
            int rem=a%2;
            bin=bin+(rem*(int)Math.pow(10, pow));
            pow++;
            a=a/2;
        }
        System.out.println("The binary number of " + number + " is " + bin);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /* System.out.println("Please enter the binary digits");
        int digits=sc.nextInt();
        binToDec(digits); */
        System.out.println("Please enter the number");
        int num=sc.nextInt();
        decToBin(num);
    }
}
    