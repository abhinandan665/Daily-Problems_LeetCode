class Solution {
    public int fib(int n) {
        if(n==1 || n==0) return n;
        int m1=0;
        int m2=1;
        for(int i=2;i<=n;i++){
            int m1dupli=m1;
            m1=m2;
            m2=m1dupli+m2;
        }
        return m2;
    }
}