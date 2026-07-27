class Solution {
    public int maxProduct(int[] nums) {
        int lar=Integer.MIN_VALUE;
        int slar=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>lar){
                slar=lar;
                lar=nums[i];
            } 
            else if(nums[i]>slar) slar=nums[i];
        }
        return (lar-1)*(slar-1);
    }
}