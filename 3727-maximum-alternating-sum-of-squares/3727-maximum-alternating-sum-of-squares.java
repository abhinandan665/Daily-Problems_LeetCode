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
        }
        for(int i=(n/2);i<n;i++){
            mxs+=(nums[i]*nums[i]);
        }
        return mxs-mns;
    }
}