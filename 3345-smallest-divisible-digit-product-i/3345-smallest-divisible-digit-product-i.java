class Solution {
    public int product(int m){
        int p=1;
        while(m>0){
            int lastDig=m%10;
            if(lastDig==0) return 0;
            p*=lastDig;
            m/=10;
        }
        return p;
    }
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++){
            int pro=product(i);
            if(pro%t==0) return i;
        }
        return -1;
    }
}