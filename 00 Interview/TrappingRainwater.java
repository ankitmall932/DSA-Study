//leetCode q-42
public class TrappingRainwater {
    //trapped water= (waterLevel-barlevel)*width;
    public static int trappedRainwater(int arr[]){
        int trappedWater=0;
        //finding the left max.
        int leftMax[] = new int[arr.length];
        leftMax[0]=arr[0];
        for(int i = 1; i<arr.length;i++){
            leftMax[i]=Math.max(arr[i],leftMax[i-1]);
        }
        //finding the right max;
        int rightMax[]=new int[arr.length];
        rightMax[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightMax[i]=Math.max(arr[i], rightMax[i+1]);
        }
        for(int i=0;i<arr.length;i++){
            int waterLevel=Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel-arr[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int arr[]={4,2,1,6,0,2,5};
        System.out.println(trappedRainwater(arr));
    }
}
