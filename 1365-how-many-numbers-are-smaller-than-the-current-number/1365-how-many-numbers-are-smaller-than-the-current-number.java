class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] copy=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            copy[i]=nums[i];
        }
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])) map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            copy[i]=map.get(copy[i]);
        }
        return copy;
    }
}