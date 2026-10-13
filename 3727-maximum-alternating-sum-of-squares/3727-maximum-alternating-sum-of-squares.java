class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<0) nums[i]=nums[i]-2*nums[i];
        }
        Arrays.sort(nums);
        long mxs=0;
        long mns=0;
        for(int i=0;i<n/2;i++){
            mns+=(nums[i]*nums[i]);
            mxs+=(nums[i+n/2]*nums[i+n/2]);
        }
        if(n%2!=0) mxs+=(nums[n-1]*nums[n-1]);
        return mxs-mns;
    }
}