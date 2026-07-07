import java.util.*;
public class Inbuilt {
    public static void print(Integer arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[]={3,5,2,1,4,8,9,6,7,1,2};
    /* Arrays.sort(arr); */ 
    Arrays.sort(arr);
    /* Arrays.sort(arr,Collections.reverseOrder()); */
    /* Arrays.sort(arr,0,4,Collections.reverseOrder()); */
    print(arr);
    }
}
