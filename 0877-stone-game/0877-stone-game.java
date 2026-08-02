class Solution{
    public boolean stoneGame(int[] piles){
        Integer[][] arr=new Integer[piles.length][piles.length];
        return solve(piles,0,piles.length-1,arr)>0;
    }
    public int solve(int[] piles,int left,int right,Integer[][] arr){
        if(left==right) return piles[left];
        if(arr[left][right]!=null) return arr[left][right];
        int pickLeft=piles[left]-solve(piles,left+1,right,arr);
        int pickRight=piles[right]-solve(piles,left,right-1,arr);
        return arr[left][right]=Math.max(pickLeft,pickRight);
    }
}