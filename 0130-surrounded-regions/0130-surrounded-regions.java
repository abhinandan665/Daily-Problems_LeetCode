class Solution {
    public void dfs(int r,int c,int[][] vis,char[][] mat){
        vis[r][c]=1;
        int n=mat.length;
        int m=mat[0].length;
        int[] delr={-1,0,1,0};
        int[] delc={0,1,0,-1};
        for(int i=0;i<4;i++){
            int row=r+delr[i];
            int col=c+delc[i];
            if(row>=0 && row<n && col>=0 && col<m && mat[row][col]=='O' && vis[row][col]!=1){
                dfs(row,col,vis,mat);
            }
        }
    }

    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        int[][] vis=new int[n][m];

        for(int i=0;i<m;i++){
            if(board[0][i]=='O' && vis[0][i]!=1) dfs(0,i,vis,board);
        }

        for(int i=0;i<m;i++){
            if(board[n-1][i]=='O' && vis[n-1][i]!=1) dfs(n-1,i,vis,board);
        }

        for(int i=0;i<n;i++){
            if(board[i][0]=='O' && vis[i][0]!=1) dfs(i,0,vis,board);
        }

        for(int i=0;i<n;i++){
            if(board[i][m-1]=='O' && vis[i][m-1]!=1) dfs(i,m-1,vis,board);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O' && vis[i][j]!=1) board[i][j]='X';
            }
        }
    }
}