class Solution {
    public int[] constructRectangle(int area) {
        int maxdiff=Integer.MAX_VALUE;
        int[] ans=new int[2];
        for(int i=1;i*i<=area;i++){
            if(area%i==0){
                int j=area/i;
                int diff=Math.abs(i-j);
                if(diff<maxdiff){
                    maxdiff=diff;
                    if(i<j){
                        ans[0]=j;
                        ans[1]=i;
                    }else{
                        ans[0]=i;
                        ans[1]=j;
                    }
                }
            }
        }
        return ans;
    }
}