class Solution {
    public int[] resultArray(int[] nums) {
        int[] ans=new int[nums.length];
        List<Integer> list=new ArrayList<>();
        ans[0]=nums[0];
        list.add(nums[1]);
        int l=1;
        int j=1;
        for(int i=2;i<nums.length;i++){
            if(ans[l-1]>list.get(j-1)){
                ans[l++]=nums[i];
            }
            else{
                list.add(nums[i]);
                j++;
            } 
        }
        for(int i=0;i<list.size();i++){
            ans[l++]=list.get(i);
        }
        return ans;
    }
}