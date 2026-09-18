class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
      int ans=numBottles;
        while(numBottles>=numExchange){
            ans+=numBottles/numExchange;
            int last=numBottles%numExchange;
            numBottles=(numBottles/numExchange)+last;

            
        }
        return ans;
    }
}