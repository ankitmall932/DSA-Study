import java.util.*;

public class JavaBasic{
    public static void main(String args[]){
        //Nested Loops
/*         for(int i=1;i<=5;i++){
            for(int j=1 ;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        } */

            //reverse
/*             int n=5;
            for(int i=1;i<=n;i++){
            for(int j=1 ;j<=(n-i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        } */

            //half 
            /* int n=79;
            for(int i=1;i<=n;i++){
            for(int j=1 ;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        } */

            //character
            int n=6;
            char ch='A';
            for(int i=1;i<=n;i++){
            for(int j=1 ;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        } //ch automatically fetch all the characters.
} 
}  
