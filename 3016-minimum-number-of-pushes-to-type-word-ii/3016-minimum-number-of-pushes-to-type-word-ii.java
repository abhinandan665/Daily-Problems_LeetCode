class Solution {
    public int minimumPushes(String word) {
        int[] freq=new int[26];
        for(char ch:word.toCharArray()){
            freq[ch-'a']++;
        }
        Arrays.sort(freq);
        int cnt=0;
        int ope=0;
        for(int i=25;i>=0;i--){
            ope+=freq[i]*(cnt/8+1);
            cnt++;  
        }
        return ope;
    }
}