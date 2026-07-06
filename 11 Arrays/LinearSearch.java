import java.util.*;
public class LinearSearch {
/*     public static int linearSearch(int num[] ){
        int key=10;
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14,16};
        System.out.println(linearSearch(num));
    } */

 /*   public static int menu(String menu[],String item){
         for(int i=0;i<menu.length;i++){
            if(menu[i].equals(item)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the Item Which You want");
        String menu[]={"Pakode","Samose","Burger","LalMohan","Rasmalai","Biryani","EggRice","Chowmin","Momo"};
        String item=sc.next();
        int index=menu(menu, item);
        if(index==-1){
            System.out.println("Item is not available or spelling mistakes");
        }else
        {
            System.out.println("The item is on "+index +" number");
        }
    } */

    public static int largest(int num[]){
        int larger=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if (larger<num[i]) {
                larger=num[i];
            }
        }
        return larger;
    }
    public static void main(String[] args) {
        int num[]={1,2,5,4,8,7,2,5,9,6,3,5,4,8,2,1,5,5 };
        System.out.println(largest(num));
    }
}
