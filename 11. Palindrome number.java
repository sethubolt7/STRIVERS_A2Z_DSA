public class Solution {
    public static boolean palindromeNumber(int n){
        String t = Integer.toString(n);
        int l=t.length()/2;
        int j=t.length()-1;
        for(int i=0;i<l;i++){
            
            if(t.charAt(i)!=t.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}