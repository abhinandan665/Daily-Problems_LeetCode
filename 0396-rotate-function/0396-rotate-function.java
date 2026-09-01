class Solution {
    public int maxRotateFunction(int[] A) {
        int n=A.length;
        long sum=0,f=0,max;
        for(int i=0;i<n;i++){sum+=A[i];f+=(long)i*A[i];}
        max=f;
        for(int i=1;i<n;i++){
            f=f+sum-(long)n*A[n-i];
            max=Math.max(max,f);
        }
        return (int)max;
    }
}