import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	int n = sc.nextInt();
	int s = 0;
	int ods = 0;
	while((float)n/10.0 != 0){
		n=(int)n;
		int t= n%10;
		if(t%2 ==0 ){
			s+=t;
		}
		else {
			ods+=t;
		}
		n=n/10;
	}
	System.out.print(s+" "+ods);

	}
}