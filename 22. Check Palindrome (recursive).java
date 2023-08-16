public class Solution {
    public static int n ; 
    public static String rstr="";
    public static int i = 0;
    public static int ck = 0;
    public static boolean isPalindrome(String str) {
        if(ck != 1){
            n = str.length();
            ck = 1;
        }
        if(n!=i){
            rstr+= str.charAt(n-i-1);
            ++i;
            isPalindrome(str);
        }
        if(rstr.equals(str)){
            return true;
        }
       else{
        return false;
       }
       
    }
}
