class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int[] arr=new int[2];
        arr[0]=-1;
        arr[1]=-1;
        int maxpro=-100000;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j) continue;
                else if(nums[i]+nums[j]==target && nums[i]>nums[j]){
                    int pro=nums[i]*nums[j];
                    if(pro>maxpro){
                        arr[0]=i;
                        arr[1]=j;
                        maxpro=pro;
                    } 
                }
            }
        }
        return arr;
        
    }
}