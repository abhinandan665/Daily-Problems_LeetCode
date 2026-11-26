class Solution {
    public boolean canAliceWin(int n) {
        int removal=10;
        boolean alice=false;
        while(n>=0){
            n-=removal;
            removal--;
            if(n<0){
                return alice;
            }
            alice=!alice;
        }
        return false;
    }
}