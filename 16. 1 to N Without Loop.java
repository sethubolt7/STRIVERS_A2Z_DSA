public class Solution {
    public static int m = 0;
    public static int ck = 0;
    public static int[] Arr ;
    public static int[] printNos(int x) {
        if(ck==0){
            Arr = new int[x];
            m=x-1;
        ck=1;
        }
        if(m!=-1){
        Arr[(x-m)-1]=(x-m);
        m-=1;
        printNos(x);}
        else{
        return Arr;
        }
        return Arr;
    }
}