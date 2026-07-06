public class BruteForce {
    public static void maxSum(int num[]){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                int currentSum=0;
                for(int k=i;k<=j;k++){
                    currentSum=currentSum+num[k];
                }
                System.out.println(currentSum);
                if (maxSum<currentSum) {
                    maxSum=currentSum;
                }
            }
        }
        System.out.println("the max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int num[]={2,3,5,6,4,8,9};
        maxSum(num);
    }
}
