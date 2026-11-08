class Solution {
    public int countServers(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[] row=new int[m];
        int[] col=new int[n];
        int totalone=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    totalone++;
                    row[i]++;
                    col[j]++;
                }
            }
        }
        int ansbar=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && row[i]<2 && col[j]<2) ansbar++;
            }
        }
        return totalone-ansbar;       
    }
}