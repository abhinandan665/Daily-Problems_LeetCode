class Solution {
    public int oddCells(int m,int n,int[][] indices) {
        int[] row=new int[m];
        int[] col=new int[n];
        for(int[] idx:indices){
            row[idx[0]]++;
            col[idx[1]]++;
        }
        int oddRow=0,oddCol=0;
        for(int x:row){
            if(x%2!=0) oddRow++;
        }
        for(int x:col){
            if(x%2!=0) oddCol++;
        }
        return oddRow*(n-oddCol)+(m-oddRow)*oddCol;
    }
}