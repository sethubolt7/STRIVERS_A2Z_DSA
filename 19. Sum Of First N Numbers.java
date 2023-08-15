public class Solution {
    public static int s=0;
    public static int sumFirstN(int n) {
        if(n!=0){
            s+=n;
            n--;
            sumFirstN(n);
        }
        return s;
    }
}