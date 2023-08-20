public class Solution {
    public static int[] countFrequency(int n, int x, int []nums){
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            int temp = nums[i];
            if(temp<=n){
            arr[temp-1]+=1;}
        } 
        return arr;
    }
}