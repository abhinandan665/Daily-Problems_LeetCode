class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxone=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                maxone=Math.max(maxone,cnt);
                cnt=0;
            }
            else cnt++;
        }
        maxone=Math.max(maxone,cnt);
        return maxone;
    }
}