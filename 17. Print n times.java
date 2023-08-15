import java.util.List;
public class Solution {
    public static void printNtimes(int n){
        if (n==0){
            System.exit(0);
        }
        else{
            System.out.print("Coding Ninjas"+" ");
            n-=1;
            printNtimes(n);
        }
    }
}