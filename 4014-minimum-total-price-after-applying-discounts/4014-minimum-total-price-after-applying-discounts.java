class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i=prices.length-1;
        int j=discounts.length-1;
        double amount=0;
        while(i>=0 && j>=0){
            amount+=(prices[i]*(100-discounts[j]))/100.00000;
            i--;
            j--;
        }
        while(i>=0){
            amount+=prices[i];
            i--;
        }
        return amount;
    }
}