public class Solution {
    public static String compareIfElse(int a, int b) {
        String str;
        if(a>b){
            str = "greater";
        }
        else if(a<b){
            str = "smaller";
        }
        else{
            str = "equal";
        }
        return str;
    }
}