public class SubArray {
    public static void array(int arr[]){
        int sum2=0;
        int total=0;
        for (int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                    sum=sum+arr[k];
                    sum2=sum2+arr[k];
                }
                total++;
                System.out.println(" - " + sum);
            }
            System.out.println();
        }
        System.out.println(total);
        System.out.println(sum2);
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8};
        array(arr);
    }
}
