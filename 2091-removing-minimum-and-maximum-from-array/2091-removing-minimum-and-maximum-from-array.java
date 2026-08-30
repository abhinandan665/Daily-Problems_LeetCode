class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n<3) return n;
        int minEle=Integer.MAX_VALUE;
        int maxEle=Integer.MIN_VALUE;
        int minInd=-1;
        int maxInd=-1;
        for(int i=0;i<n;i++){
            if(nums[i]<minEle){
                minEle=nums[i];
                minInd=i;
            }
            if(nums[i]>maxEle){
                maxEle=nums[i];
                maxInd=i;
            }
        }
        int a=Math.max(maxInd,minInd)+1;
        int b=n-Math.min(maxInd,minInd);
        int c=0;
        if(minInd<maxInd){
            c=minInd+1+(n-maxInd);
        }
        else{
            c=maxInd+1+(n-minInd);
        }
        return Math.min(a,Math.min(b,c));
    }
}