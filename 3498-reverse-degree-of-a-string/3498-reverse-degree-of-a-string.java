class Solution {
    public int reverseDegree(String s) {
        int cnt=0;
        for(int i=0;i<s.length();i++){
            cnt+=(i+1)*(123-s.charAt(i));
        }
        return cnt;
    }
}
