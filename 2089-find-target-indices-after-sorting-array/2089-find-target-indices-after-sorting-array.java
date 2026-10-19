class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        int cntsmaller=0;
        int cnttarget=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target) cntsmaller++;
            else if(nums[i]==target) cnttarget++;
        }
        for(int i=cntsmaller;i<cntsmaller+cnttarget;i++) list.add(i);
        return list;
    }
}