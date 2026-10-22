class Solution {
    public boolean threeFibonacciSum(int n) {
        long a=0;
        long b=1;
        while(a+b+b+a<=n){
            long c=a+b;
            if(a+b+c==n) return true;
            a=b;
            b=c;
        }
        return false;
    }
}