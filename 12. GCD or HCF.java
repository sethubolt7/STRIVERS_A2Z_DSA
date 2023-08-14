public class Solution {
    public static int calcGCD(int n, int m){
        int l =0;
        if (m>n){
            l=n;
        }
        else{
            l=m;
        }
        int max=0;
        for (int i=1;i<=l;i++){
            if(m%i == 0 & n%i == 0){
                    max=i;
                
            }
        }
        return max;
    }
    }