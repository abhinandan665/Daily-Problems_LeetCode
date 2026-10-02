class Pairs{
    int row;
    int col;
    int time;
    public Pairs(int row,int col,int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=grid;
        Queue<Pairs> q=new LinkedList<>();
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                if(grid[r][c]==2){
                    q.offer(new Pairs(r,c,0));
                }   
            }
        }
        int maxTime=0;
        while(!q.isEmpty()){
            int r1=q.peek().row;
            int c1=q.peek().col;
            int t=q.peek().time;
            q.poll();
            vis[r1][c1]=2;
            int[] delr={-1,1,0,0};
            int[] delc={0,0,1,-1};
            for(int i=0;i<4;i++){
                int delRow=delr[i]+r1;
                int delCol=delc[i]+c1;
                if(delRow>=0 && delRow<n && delCol>=0 && delCol<m && grid[delRow][delCol]==1 && vis[delRow][delCol]!=2){
                    q.offer(new Pairs(delRow,delCol,t+1));
                    vis[delRow][delCol]=2;
                    maxTime=Math.max(maxTime,t+1);
                }
            }
        }
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                if(grid[r][c]==1 && vis[r][c]!=2){
                    return -1;
                }   
            }
        }
        return maxTime;
    }
}