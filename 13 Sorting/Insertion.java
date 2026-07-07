
public class Insertion {
    public static void insertion(int arr[]){
        for (int i=1;i<arr.length;i++){
            int value=arr[i];
            int pre=i-1;
            while (pre>=0&&arr[pre]>value) {
                arr[pre+1]=arr[pre];
                pre--;
            }
            arr[pre+1]=value;
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2,6,9,7,8};
        insertion(arr);
        print(arr);
    }
}
