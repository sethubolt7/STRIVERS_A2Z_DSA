public class Solution {
    public static int countDigits(int n){
        int t = 1;
        while(n/10 != 0){
            t += 1;
            n = n/10;
        }
        return t;
    }
}
