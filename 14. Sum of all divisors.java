public class Solution {
    public static int sumOfAllDivisors(int n){
        int s =0;
        for(int i = 1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                if(i%j==0){
                    s+=j;
                }
            }
        }
        return s;
    }
}