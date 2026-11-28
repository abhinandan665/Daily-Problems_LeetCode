class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int operation=0;
        int ans=0;
        while(operation<n){
            int max=0;
            for(int i=0;i<m;i++){
                int max1=0;
                int maxIndx=-1;
                for(int j=0;j<n;j++){
                    if(grid[i][j]>max1){
                        maxIndx=j;
                        max1=grid[i][j];
                    }
                }
                grid[i][maxIndx]=-1;
                max=Math.max(max,max1);
            }
            ans+=max;
            operation++;
        }
        return ans;
    }
}