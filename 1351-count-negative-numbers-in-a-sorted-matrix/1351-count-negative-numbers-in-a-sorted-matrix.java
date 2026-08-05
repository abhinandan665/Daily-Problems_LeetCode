class Solution {
    public int countNegatives(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int cnt=0;
        for(int[] row:grid){
            int l=0;
            int h=n-1;
            int fn=n;
            while(l<=h){
                int mid=(l+h)/2;
                if(row[mid]<0){
                    fn=mid;
                    h=mid-1;
                }
                else l=mid+1;
            }
            cnt+=n-fn;
        }
        return cnt;
    }
}