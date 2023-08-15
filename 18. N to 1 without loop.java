public class Solution
{   public static int arr[] ;
    public static int ck = 0;
    public static int i =0;
    public static int[] printNos(int x) {
        if(ck==0){
            ck=1;
            arr = new int[x];
        }
        if(x!=0){
            arr[i]=x;
            x-=1;
            i++;
            printNos(x);
        }
        else{
            return arr;
        }
        return arr;
    }
}