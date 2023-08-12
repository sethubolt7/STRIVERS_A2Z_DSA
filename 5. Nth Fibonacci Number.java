import java.util.Scanner;
import java.util.ArrayList;

public class Solution {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		for(int i=2;i<n;i++){
			list.add(list.get(i-1)+list.get(i-2));
			
		}
		System.out.print(list.get(n-1));
		
	}

}
