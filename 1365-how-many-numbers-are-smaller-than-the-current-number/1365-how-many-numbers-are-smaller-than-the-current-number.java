class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq=new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int sum=0;
        for(int i=0;i<101;i++){
            if(freq[i]>0){
                int temp=freq[i];
                freq[i]=sum;
                sum+=temp;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=freq[nums[i]];
        }
        return nums;
    }
}