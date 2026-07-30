class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        if(n<=8){
            return n;
        }else if(n<=16){
            int rem=n-8;
            return 8+(2*rem);
        }else if(n<=24){
            int rem=n-16;
            return 8+16+(3*rem);
        }else{
            int rem=n-24;
            return 8+16+24+(4*rem);
        }
    }
}