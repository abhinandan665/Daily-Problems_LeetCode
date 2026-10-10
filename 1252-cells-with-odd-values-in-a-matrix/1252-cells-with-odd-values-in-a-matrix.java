class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat=new int[m][n];
        int ans=0;
        for(int i=0;i<indices.length;i++){
            int ri=indices[i][0];
            int ci=indices[i][1];
            for(int j=0;j<n;j++){
                mat[ri][j]++;
                if(mat[ri][j]%2==0) ans--;
                else ans++;
            }
            for(int j=0;j<m;j++){
                mat[j][ci]++;
                if(mat[j][ci]%2==0) ans--;
                else ans++;
            }
        }
        return ans;
    }
}