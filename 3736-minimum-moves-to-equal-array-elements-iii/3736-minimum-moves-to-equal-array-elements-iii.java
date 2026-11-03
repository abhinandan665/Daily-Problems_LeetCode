class Solution {
    public int minMoves(int[] nums) {
        int mx=Integer.MIN_VALUE;
        for(int num:nums){
            if(mx<num) mx=num;
        }
        int ans=0;
        for(int num:nums){
            ans+=mx-num;
        }
        return ans;
    }
}