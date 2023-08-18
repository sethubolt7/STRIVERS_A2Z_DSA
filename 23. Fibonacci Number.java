class Solution {
    public int fibb(int n,int n1,int n2,int t){
        if(n != 0){
        t = n1 + n2;
        n1 = n2;
        n2 = t;
        n -= 1;
        int s = fibb(n,n1,n2,t);
        return s;}
        else{
        System.out.println(n1+" "+n2+" "+t);
        return n1;}
    }
    public int fib(int n) {
        int s = fibb(n,0,1,0);
        System.out.println(s);
        return s;
    }
}