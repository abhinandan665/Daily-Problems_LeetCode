class Solution {
    public void dfs(int r,int c,int[] delr,int[] delc,int[][] grid,int[][] vis){
        vis[r][c]=1;
        int m=grid[0].length;
        int n=grid.length;
        for(int i=0;i<4;i++){
            int row=r+delr[i];
            int col=c+delc[i];
            if(row>=0 && row<n && col>=0 && col<m && grid[row][col]==1 && vis[row][col]!=1){
                dfs(row,col,delr,delc,grid,vis);
            }
        }
    }
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        int[] delr={-1,0,1,0};
        int[] delc={0,1,0,-1};
        //for upper row
        for(int i=0;i<m;i++){
            if(grid[0][i]==1 && vis[0][i]!=1){
                dfs(0,i,delr,delc,grid,vis);
            }
        }
        //for lower row
        for(int i=0;i<m;i++){
            if(grid[n-1][i]==1 && vis[n-1][i]!=1){
                dfs(n-1,i,delr,delc,grid,vis);
            }
        }
        //for left col
        for(int i=1;i<n-1;i++){
            if(grid[i][0]==1 && vis[i][0]!=1){
                dfs(i,0,delr,delc,grid,vis);
            }
        }
        //for right col
        for(int i=1;i<n-1;i++){
            if(grid[i][m-1]==1 && vis[i][m-1]!=1){
                dfs(i,m-1,delr,delc,grid,vis);
            }
        }
        //cnt 1
        int ans=0; 
        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++){
                if(grid[i][j]==1 && vis[i][j]!=1) ans++;
            }
        }
        return ans;
    }
}