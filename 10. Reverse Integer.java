class Solution {
    public int reverse(int x) {
        int ck=0;
        String t = Integer.toString(x);
        String m="";
        String tt = Integer.toBinaryString(x);
        if(tt.length()>32){
            return 0;
        }
        else{if(t.charAt(0)=='-'){
            ck =1;
            m+="-";
        }
        for(int i=t.length()-1;i>-1;i--){
            if(t.charAt(i)=='-'){
             continue;
        }
            m +=t.charAt(i);  
        }
        long k =(Long.parseLong(m));
        if(k>2147483647 | k<-2147483648 ){
            return 0;
        }
        int n = Integer.parseInt(m);
        return n;}
    }
}