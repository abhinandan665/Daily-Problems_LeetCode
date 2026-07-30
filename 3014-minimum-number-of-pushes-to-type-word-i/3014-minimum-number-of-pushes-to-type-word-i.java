class Solution {
    public int minimumPushes(String word) {
        HashSet<Character> set=new HashSet<>();
        for(char ch:word.toCharArray()){
            set.add(ch);
        }
        int n=set.size();
        int push=0;
        if(n<=8){
            push=n;
        }else if(n<=16){
            int rem=n-8;
            push=8+(2*rem);
        }else if(n<=24){
            int rem=n-16;
            push=8+16+(3*rem);
        }else{
            int rem=n-24;
            push=8+16+24+(4*rem);
        }
        return push;
    }
}