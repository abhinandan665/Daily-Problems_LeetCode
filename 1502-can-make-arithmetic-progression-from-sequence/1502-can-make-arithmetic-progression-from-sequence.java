class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        boolean isPossible=true;
        int diff=arr[1]-arr[0];
        int n=arr.length;
        for(int i=2;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=diff){
                isPossible=false;
                break;
            }
        }
        return isPossible;
    }
}