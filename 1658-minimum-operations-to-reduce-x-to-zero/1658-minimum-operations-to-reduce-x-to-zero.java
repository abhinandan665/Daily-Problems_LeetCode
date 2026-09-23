class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int totalSum=0;
        for(int num:nums){
            totalSum+=num;
        }
        int xbar=totalSum-x;
        if(xbar<0) return -1;
        int i=0;
        int j=0;
        int sum=0;
        int minOper=Integer.MAX_VALUE;
        while(i<n){
            sum+=nums[i];
            while(sum>xbar && j<n){
                sum-=nums[j];
                j++;
            }
            if(sum==xbar) minOper=Math.min(minOper,j+n-i-1);
            i++;
        }
        if(minOper==Integer.MAX_VALUE) return -1;
        return minOper;
    }
}