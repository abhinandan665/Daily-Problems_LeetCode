class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] freq=new int[n+1];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        int misNum=-1;
        int repNum=-1;
        for(int i=1;i<n+1;i++){
            if(freq[i]==0) misNum=i;
            if(freq[i]==2) repNum=i;
        }
        return new int[]{repNum,misNum};
    }
}