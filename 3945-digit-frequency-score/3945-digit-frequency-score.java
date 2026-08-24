class Solution {
    public int digitFrequencyScore(int n) {
        int[] freq=new int[10];
        int ans=0;
        while(n>0){
            ans+=n%10;
            n/=10;
        }
        return ans;
    }
}