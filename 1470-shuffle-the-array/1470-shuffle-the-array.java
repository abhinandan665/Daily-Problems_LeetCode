class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[2*n];
        int i=0;
        int j=n;
        int i1=0;
        int j1=1;
        for(int k=0;k<n;k++){
            ans[i1]=nums[i];
            i++;
            i1+=2;
            ans[j1]=nums[j];
            j++;
            j1+=2;
        }
        return ans;
    }
}