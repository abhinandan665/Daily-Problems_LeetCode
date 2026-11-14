class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        boolean isPossible=true;
        int diff=arr[1]-arr[0];
        for(int i=2;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=diff){
                isPossible=false;
                break;
            }
        }
        return isPossible;
    }
}