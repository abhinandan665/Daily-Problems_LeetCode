class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] freq=new int[51];
        int maxEle=0,n=nums.length;
        for(int x:nums){
            freq[x]++;
            maxEle=Math.max(maxEle,x);
        }
        if(k==1){
            for(int i=50;i>=0;i--){
                if(freq[i]==1)return i;
            }
        }
        else if(k==n){
            return maxEle;
        }
        else{
            if(freq[nums[0]]==1&&freq[nums[n-1]]==1)
                return Math.max(nums[0],nums[n-1]);
            if(freq[nums[0]]==1)return nums[0];
            if(freq[nums[n-1]]==1)return nums[n-1];
        }
        return -1;
    }
}