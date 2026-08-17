class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        boolean[] arr1=new boolean[101];
        boolean[] arr2=new boolean[101];
        for(int num:nums1){
            arr1[num]=true;
        }
        for(int num:nums2){
            arr2[num]=true;
        }
        int answer1=0;
        int answer2=0;
        for(int num:nums1){
            if(arr2[num]){
                answer1++;
            }
        }
        for(int num:nums2){
            if(arr1[num]){
                answer2++;
            }
        }
        int[] ans={answer1,answer2};
        return ans;
    }
}