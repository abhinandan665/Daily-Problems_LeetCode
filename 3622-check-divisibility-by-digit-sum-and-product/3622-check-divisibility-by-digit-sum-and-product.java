class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int sum=0;
        int pro=1;
        while(temp>0){
            int lastdigi=temp%10;
            sum+=lastdigi;
            pro*=lastdigi;
            temp/=10;
        }
        return n%(sum+pro)==0;
    }
}