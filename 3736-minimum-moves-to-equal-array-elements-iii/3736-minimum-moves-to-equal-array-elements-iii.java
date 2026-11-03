class Solution {
    public int minMoves(int[] nums) {
        int sum=0;
        int mx=Integer.MIN_VALUE;
        for(int num:nums){
            sum+=num;
            if(mx<num) mx=num;
        }
        return nums.length*mx-sum;
    }
}