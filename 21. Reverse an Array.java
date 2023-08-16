public class Solution {
    public static int arr[];
    public static int i = 0;
    public static int ck = 0;
    public static int[] reverseArray(int n, int []nums) {
        if(ck != 1){
            arr = new int[n];
            ck = 1;
        }
        if(n!=i){
            arr[i] = nums[n-i-1];
            ++i;
            reverseArray(n,nums);
        }
        return arr;

    }
}