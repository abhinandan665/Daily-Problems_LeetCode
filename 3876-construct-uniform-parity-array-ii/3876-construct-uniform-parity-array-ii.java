class Solution {
    public boolean uniformArray(int[] nums1) {
        int mini=Integer.MAX_VALUE;
        boolean onlyEven=true;
        for(int num:nums1){
            if(num<mini) mini=num;
            if(num%2!=0) onlyEven=false;
        }
        if(mini%2!=0 || onlyEven) return true;
        return false;
    }
}