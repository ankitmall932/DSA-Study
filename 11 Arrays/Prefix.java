public class Prefix {
    public static void prefix(int number[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        int prefix[]=new int [number.length];
        prefix[0]=number[0];//always same 
        //calculate prefix
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        }
        //find max sum
        for (int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                currSum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if (maxSum<currSum) {
                    maxSum=currSum;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        prefix(number);
    }
}
