import java.util.*;

public class Prime {
    
  /*   //it is the first way of finding prime.
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the number");
        int num=sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                isPrime=false;
            }
        }
        if(isPrime==true){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a Prime number");
        }
    } */

 /*    //this is the second approach to find the number is prime or not.
    public static boolean prime(int num){
        boolean isPrime= true;
        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                isPrime=false;
            }
        }
        if(isPrime==true){
            System.out.println("Prime");
        }else{
            System.out.println("notPrime");
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number");
        int num=sc.nextInt();
        prime(num);
    } */

 /*    //optimized way of finding prime number
    public static boolean prime(int num){
        boolean isPrime=true;
        for(int i=2; i<=Math.sqrt(num);i++){ //math sqrt is used for finding the square root of  a number;
            if(num%i==0){
                isPrime=false;
            }
        }
        if(isPrime==true){                                                                               
            System.out.println("Prime");
        }else{
            System.out.println("NotPrime");
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number");
        int num=sc.nextInt();
        prime(num);
    } */

    //Primes in range
    public static boolean prime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
            return true;
    }

    public static void rangePrime(int num){
        for (int i=2; i<=num; i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num=sc.nextInt();
        rangePrime(num);
    }
}
