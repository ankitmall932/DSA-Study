import java.util.*;

public class JavaBasic{
    public static void main(String args[]){
/*         int a= 10;
        int b=15;
        int c=20;
        int avg=(a+b+c)/3;
        System.out.print(avg); */
/*         int side=24;
        int area=side*side;
        System.out.print(area);
 */
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter the price of the Pen");
    int pen=scn.nextInt();
    System.out.println("Enter the price of the Pencil");
    int pencil=scn.nextInt();
    System.out.println("Enter the price of the Eraser");
    int eraser=scn.nextInt();
    int sum=eraser+pen+pencil;
    System.out.print("Total price = ");
    System.out.println(sum);
    int gst = sum/100*18;
    System.out.print("The total GST on this purchase = ");
    System.out.println(gst);
    int total=gst+sum;
    System.out.print("The total Price of the item is = ");
    System.out.println(total);
}
} 