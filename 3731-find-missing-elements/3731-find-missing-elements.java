class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int min=101;
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]<min) min=nums[i];
            if(nums[i]>max) max=nums[i];
            map.put(nums[i],0);
        }
        List<Integer> list=new ArrayList<>();
        for(int i=min+1;i<max;i++){
            if(!map.containsKey(i)) list.add(i);
        }
        return list;
    }
}