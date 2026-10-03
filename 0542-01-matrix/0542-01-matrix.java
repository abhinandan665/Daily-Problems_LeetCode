class Pair{
    int row;
    int col;
    public Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] ans=new int[m][n];
        boolean[][] vis=new boolean[m][n];
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.offer(new Pair(i,j));
                    vis[i][j]=true;
                }
            }
        }
        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};
        while(!q.isEmpty()){
            Pair p=q.poll();
            for(int k=0;k<4;k++){
                int nr=p.row+dr[k];
                int nc=p.col+dc[k];
                if(nr>=0 && nr<m && nc>=0 && nc<n && !vis[nr][nc]){
                    vis[nr][nc]=true;
                    ans[nr][nc]=ans[p.row][p.col]+1;
                    q.offer(new Pair(nr,nc));
                }
            }
        }
        return ans;
    }
}