class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=101;
        int max=0;
        int[] arr=new int[101];
        for(int n:nums){
            if(min>n) min=n;
            if(max<n) max=n;
            arr[n]=1;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=min+1;i<max;i++){
            if(arr[i]!=1) list.add(i);
        }
        return list;
    }
}