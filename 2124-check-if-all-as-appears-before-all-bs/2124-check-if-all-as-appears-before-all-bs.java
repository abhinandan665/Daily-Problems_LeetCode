class Solution {
    public boolean checkString(String s) {
        int bcnt=0;
        for(char ch:s.toCharArray()){
            if(ch=='a'){
                if(bcnt>0) return false;
            }
            else bcnt++;
        }
        return true;
    }
}