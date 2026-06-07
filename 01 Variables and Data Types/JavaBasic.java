import java.util.*;

public class JavaBasic{
    public static void main(String args[]){
        //for loop
    /*     for(int i=0; i<=100; i++){
            System.out.println("hello ankit");
        } */
       //while loop
/*         int counter = 0;
        while (counter<=100) {
        System.out.println(counter);
        counter++;
        } */
        /* System.out.println("Please enter the range");
        Scanner scn=new Scanner(System.in);
        int range=scn.nextInt();
        int counter=1;
        while (counter<=range) {
            System.out.println(counter);
            counter++;
        } */
/*         System.out.println("Please enter the range");
        Scanner scn=new Scanner(System.in);
        int range=scn.nextInt();
        int counter=1;
        int sum=0;
        while (counter<=range) {
            System.out.println(counter);
            sum=sum+counter;
            counter++;
        }
        System.out.println("The sum = " + sum); */

        //stars print
/*         for(int i=1;i<=4;i++){
            System.out.println("****");
        } */

        //reverse number
/*         System.out.println("Please Enter the number");
        Scanner scn=new Scanner(System.in);
        int number=scn.nextInt();
        while(number>0){
            int lastDigit=number%10; // Kisi bhi number ka last digit nikalna ho to modulo ka use hota hai
            System.out.print(lastDigit);
            number=number/10; //Kisi bhi number ke last digit ko hatana ho to divide ka use hota hai.
        } */

        //reverse the number and save in a new variable
   /*      System.out.println("Please Enter the number");
        Scanner scn=new Scanner(System.in);
        int number=scn.nextInt();
        int reverse=0;
        while(number>0){
            int lastDigit=number%10;
            reverse=(reverse*10)+lastDigit;
            number=number/10;                     
        }
        System.out.print(reverse);*/

        //break
/*         for(int i=1;i<=10;i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loop"); */
/*         Scanner scn=new Scanner(System.in);
        while (true) {
                    System.out.print("Please Enter the number : ");
            int n=scn.nextInt();
            if (n%10==0) {
                break;
            }
            System.out.println(n);
        }
        System.out.println("You enter a number which is totally divisible by 10.");*/

        //continue
/*                 Scanner scn=new Scanner(System.in);
        while (true) {
                    System.out.print("Please Enter the number : ");
            int n=scn.nextInt();
            if (n%10==0) {
                continue;
            }
            System.out.println(n);
        } //it is use to skip a particular value or a particular range. */

        //number is prime or not
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number to check ");
        int n=sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        if(isPrime==true){
            System.out.println(n + " is prime");
        }else{
            System.out.println(n + " is not prime");
        }
} 
}  
