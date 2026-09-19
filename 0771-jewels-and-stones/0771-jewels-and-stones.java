class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans=0;
        for(char c1:jewels.toCharArray()){
            int cnt=0;
            for(char c2:stones.toCharArray()){
                if(c1==c2) cnt++;
            }
            ans+=cnt;
        }
        return ans;
    }
}