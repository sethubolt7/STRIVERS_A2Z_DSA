import java.util.List;
import java.util.ArrayList;
public class Solution {
    public static List<Long> arr = new ArrayList<>();
    public static long fact = 1;
    public static long i = 1;
    public static List<Long> factorialNumbers(long n) {
            if(fact*i>n){
                return arr;
            }
            else{
                fact = fact*i;
                arr.add(fact);
                i++;
                factorialNumbers(n);
            }
            return arr;
    }
}