
import java.util.*;

public class Parameters{

    /* public static void printAnkit(){
        System.out.println("Ankit Mall");
    } */

 /*    public static int printAnkit(){
        System.out.println("Ankit Pratap Mall");
        return 1;
    } */
    
    /* public static int printAnkit(int a, int b){
        int sum=a+b;
        return sum;
        
    }
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter your first digit");
        int a=scn.nextInt();
        System.out.println("Please enter the second digit");
        int b=scn.nextInt();
        int add=printAnkit(a,b);
        System.out.println("the sum : " + add);
    }  */
    
/*     public static int product(int a , int b){
        int product=a*b;
        System.out.println(product);
        return product;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("please enter the first number");
        int a = scn.nextInt();
        System.out.println("please enter the second number ");
        int b = scn.nextInt();
        product(a,b);
    } */

    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
        f=f*i;
        }
        return f;
    }

    public static int binCoeff(int n, int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int finalFact=fact_n/(fact_r*fact_nmr);
        System.out.println(finalFact);
        return finalFact;
    }
    public static void main(String[] args) {
        binCoeff(5 , 2);
    }
}  
