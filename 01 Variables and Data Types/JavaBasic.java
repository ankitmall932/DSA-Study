import java.util.*;

public class JavaBasic{
    public static void main(String args[]){
        // if-else
/*         Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the student number ");
        int marks= scn.nextInt();
        if(marks>=33){
            System.out.println("Congratulations you Passed the exam");
        }else{
            System.out.println("Sorry you are failed the exam ! Better Luck Next Time");
        } */

        //else-if
/*         Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the student number ");
        int marks= scn.nextInt();
        if(marks>=80){
            System.out.println("You are a good student");
        }else if(marks >= 60){
            System.out.println("Average student");
        }else if(marks>=33){
            System.out.println("Below Average  ");
        }else{
            System.out.println("Sorry you are failed the exam ! Better Luck Next Time");
        } */

        //odd even
/*         Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the number ");
        int number= scn.nextInt();
        if(number % 2 == 0){
            System.out.println("The given Number is Even");
        }
        else{
            System.out.println("The given Number is odd");
    } */

        //largest three number
        /* Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the first number ");
                int a= scn.nextInt();
        System.out.println("Please enter the second number ");
                int b= scn.nextInt();
        System.out.println("Please enter the Third number ");
                int c= scn.nextInt();
        if(a > b && a > c){
            System.out.println(a);
        }else if(b > c){
            System.out.println(b);
        }else {
            System.out.println(c);
        } */

        //IT
/*         Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the amount ");
                float income= scn.nextInt();
                float tax;
        if(income<=500000){
            tax=0;
        }else if(income>500000 && income<=1000000){
            tax = (income/100*20);
        }else {
            tax=(income/100*30);
        } 
        System.out.println("your tax is " + tax); */

        //ternary operator
/*         Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the first number ");
            int a= scn.nextInt();
/*         System.out.println("Please enter the second number ");
            int b= scn.nextInt();
        int larger = (a>b)?a:b;
        System.out.println(larger); 
        String number= (a % 2 == 0)?"Even":"Odd";
        System.out.println(number); */
        
        //switch
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the item number ");
            int a= scn.nextInt();
            switch (a) {
                case 1: 
                    System.out.println("Burger");
                    break;
                    case 2: 
                    System.out.println("Maggie");
                    break;               
                    case 3: 
                    System.out.println("Pasta");
                    break;                
                    case 4: 
                    System.out.println("Momos");
                    break;                
                    case 5: 
                    System.out.println("Tikki");
                    break;
                default:
                    System.out.println("Sb spna Tha");
                    break;
            }
}
}