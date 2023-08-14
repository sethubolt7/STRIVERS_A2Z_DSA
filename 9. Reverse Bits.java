public class Solution {
	public static long reverseBits(long n) {
		String tt = "";
		String t = Long.toBinaryString(n);
		int lz = 32-t.length();
		StringBuilder z = new StringBuilder();
		if(lz>0){
			for(int i=0;i<lz;i++){
				z.append("0");
			}
		}
		t = z+t;
		for (int i = t.length()-1;i>-1;i--){
			tt+=t.charAt(i);
		}
		n = Long.parseLong(tt,2);
		return n;
	}
}
