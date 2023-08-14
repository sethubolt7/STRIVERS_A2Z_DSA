import java.lang.Math;
public class Solution {
	public static String isPrime(int num) {
		if((num%2==0 & num!=2)|num==1){
			return "NO";
		}
		else{
			for(int i = 2;i<Math.sqrt(num);i++){
				if(num%i==0){
					return "NO";
				}
			}
		return "YES";
		}
	}
}