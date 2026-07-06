import java.util.*;
public class create {
/*     public static void main(String[] args) {
        int marks[] = { 2, 56, 15, 89, 36 };
        int mark[] = new int[50];
        Scanner sc=new Scanner(System.in);
        mark[0]=sc.nextInt();
        String fruits[] = { "apple", "mango", "papaya" };
        System.out.println(fruits[1]);
        System.out.println(mark[0]);
        System.out.println(marks[1]);
    } */

    public static void change(int arr[],int a){
        a=10;
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
    }
    public static void main(String[] args) {
        int a=5;
        int arr[]={56,57,58};
        change(arr, a);
        System.out.println(a);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
