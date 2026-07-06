import java.util.Scanner;

public class BinarySearch {
    public static int binary(int num[],int key){
        int start=0;
        int end=num.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if (num[mid]==key) {
                return mid;
            }
            if (num[mid]<key) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number which you want to find");
        int key=sc.nextInt();
        System.out.println(binary(num, key));
    }
}
