class Solution {
    public int minimumPushes(String word) {
        int[] freq=new int[26];
        for(char ch:word.toCharArray()){
            freq[ch-'a']++;
        }
        Arrays.sort(freq);
        int cnt=0;
        int ope=0;
        for(int i=freq.length-1;i>=0;i--){
            cnt++;
            if(cnt<=8){
                ope+=freq[i];
            }else if(cnt<=16){
                ope+=2*freq[i];
            }else if(cnt<=24){
                ope+=3*freq[i];
            }else ope+=4*freq[i];
        }
        return ope;
    }
}