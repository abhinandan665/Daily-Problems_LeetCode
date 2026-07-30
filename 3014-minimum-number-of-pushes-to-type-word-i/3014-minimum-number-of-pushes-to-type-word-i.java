class Solution {
    public int minimumPushes(String word) {
        if(word.length()<=8){
            return word.length();
        }else if(word.length()<=16){
            int rem=word.length()-8;
            return 8+(2*rem);
        }else if(word.length()<=24){
            int rem=word.length()-16;
            return 8+16+(3*rem);
        }else{
            int rem=word.length()-24;
            return 8+16+24+(4*rem);
        }
    }
}