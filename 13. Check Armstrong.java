import java.util.Scanner;
import java.lang.Math;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = Integer.toString(n);
		int l = s.length();
		int t = n;
		int su = 0;
		int tt;
		while(t !=0){
			tt = t%10;
			su+=Math.pow(tt,l);
			t = t/10;
		}
		if (su==n){
			System.out.print(true);
		}
		else{
			System.out.print(false);
		}

	}
}
